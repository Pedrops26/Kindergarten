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
public class Kid {
    private int age;
    private double weight;
    private String size;
    private String specialSituation;
    private Group id;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getSpecialSituation() {
        return specialSituation;
    }
    public void setSpecialSituation(String specialSituation) {
        this.specialSituation = specialSituation;
    }

    public Group getId() {
        return id;
    }
    public void setId(Group id) {
        this.id = id;
    }


    public void doAchievment(){

    }
}


