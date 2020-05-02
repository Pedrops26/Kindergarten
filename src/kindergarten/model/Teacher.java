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
public class Teacher extends Person {

    private String cellphone;
    private String speciality;
    private int groupId;

    public Teacher(String name, String lastName, String idType, double idNumber, String cellphone, String speciality, int groupId) {
        super(name, lastName, idType, idNumber);
        this.cellphone = cellphone;
        this.speciality = speciality;
        this.groupId = groupId;
    }

    public void qualifyAchievment(){

    }
    public void createAchievmentObservation(){

    }
    public void createAchievmentReport(){

    }

    public String getCellphone() {
        return cellphone;
    }
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getGroupId() {
        return groupId;
    }
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
