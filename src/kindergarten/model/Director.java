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
public class Director extends Person {
    String email = "director.kinder@gmail.com";
    String cellphone = "3194561024";

    public Director(String name, String lastName, String idType, double idNumber, String email, String cellphone) {
        super(name, lastName, idType, idNumber);
        name = "Director";
        this.email = email;
        this.cellphone = cellphone;
    }
}