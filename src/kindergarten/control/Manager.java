/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kindergarten.control;
import java.util.Scanner;
import kindergarten.model.*;
import kindergarten.view.*;
/**
 *
 * @author Pedro Saldarriaga
 */
public class Manager {
    Scanner sc = new Scanner(System.in);
    Person Persons[] = new Person[3];
    int i = 0;
    
    public void registerPerson(String name, String lastName, String idType, String idNumber) {
             //Do you wish register another person?
            Persons[i] = new Person(name, lastName, idType, idNumber);
            i++;
    }

    public void searchPersonInfo(String idNumber) {
        Search search = new Search();
        String id = idNumber;
        String name = null;
        String lastName = null;
        String idType = null;
        for(int i = 0; i < Persons.length; i++){
            if(id.equals(Persons[i].getIdNumber())){
                name = Persons[i].getName();
                lastName = Persons[i].getLastName();
                idType = Persons[i].getIdType();
            }  else{
                if(i == Persons.length){
                    //search.setjLabel5("ID doesn't exist");
                    name = null;
                    lastName = null;
                    idType = null;
                }
            }
        }
        search.setjTextField2(name);
        search.setjTextField3(lastName);
        search.setjTextField4(idType);
    }

    public void updatePersonInfo(String idNumber) {
        for(int i = 0; i < Persons.length; i++){
            if(idNumber == Persons[i].getIdNumber()){
                System.out.println("Enter new name: ");
                String newName = sc.nextLine();
                Persons[i].setName(newName);
                System.out.println("Enter new lastname: ");
                String newLastName = sc.nextLine();
                Persons[i].setLastName(newLastName);
                System.out.println("Enter new id type: ");
                String newIdType = sc.nextLine();
                Persons[i].setIdType(newIdType);
                System.out.println("Enter new id number: ");
                String newIdNumber = sc.nextLine();
                Persons[i].setIdNumber(newIdNumber);
            } else{
                if(i == Persons.length){
                    System.out.println("ID no exists.");
                }
            }
        }
    }

    public void deletePersonInfo(String idNumber) {
        for(int i = 0; i < Persons.length; i++){
            if(idNumber == Persons[i].getIdNumber()){
                Persons[i].setName(null);
                Persons[i].setLastName(null);
                Persons[i].setIdType(null);
                Persons[i].setIdNumber("0000");
            }
        }
    }

    public void showPersonInfo(){
        for(int i = 0; i < Persons.length; i++){
            System.out.println("Person #"+(i+1));
            System.out.println("Name: " +Persons[i].getName());
            System.out.println("Last name: " +Persons[i].getLastName());
            System.out.println("Id Type: " +Persons[i].getIdType());
            System.out.println("Id Number: " +Persons[i].getIdNumber());
        }
    }
}
