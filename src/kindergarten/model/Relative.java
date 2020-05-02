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
public class Relative extends Person {

    private String phone;
    private String kinship;
    private String cellphone;
    private String address;

    private void getBimestralReport(){

    }

    public Relative(String name, String lastName, String idType, double idNumber, String phone, String kinship, String cellphone, String address) {
        super(name, lastName, idType, idNumber);
        this.phone = phone;
        this.kinship = kinship;
        this.cellphone = cellphone;
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKinship() {
        return kinship;
    }
    public void setKinship(String kinship) {
        this.kinship = kinship;
    }

    public String getCellphone() {
        return cellphone;
    }
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
