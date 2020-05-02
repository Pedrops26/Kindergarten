/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kindergarten.model;

/**
 *
 * @author Pedro Saldarriaga
 */
public class Person {
   private String name;
   private String lastName;
   private String idType;
   private String idNumber;

   public Person(String name, String lastName, String idType, String idNumber) {
      this.name = name;
      this.lastName = lastName;
      this.idType = idType;
      this.idNumber = idNumber;
   }

    public Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }

   public String getLastName() {
      return lastName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getIdType() {
      return idType;
   }
   public void setIdType(String idType) {
      this.idType = idType;
   }

   public String getIdNumber() {
      return idNumber;
   }
   public void setIdNumber(String idNumber) {
      this.idNumber = idNumber;
   }
}
