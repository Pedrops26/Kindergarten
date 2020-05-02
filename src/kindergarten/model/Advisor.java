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
public class Advisor extends Relative {
    private String schedule;
    private String permission;

    public Advisor(String name, String lastName, String idType, double idNumber, String phone, String kinship, String cellphone, String address, String schedule, String permission) {
        super(name, lastName, idType, idNumber, phone, kinship, cellphone, address);
        this.schedule = schedule;
        this.permission = permission;
    }

    public String getSchedule() {
        return schedule;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getPermission() {
        return permission;
    }
    public void setPermission(String permission) {
        this.permission = permission;
    }
}
