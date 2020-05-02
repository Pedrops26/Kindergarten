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
public class Achievment {
    private String name;
    private double percentage;
    private String observation;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getObservation() {
        return observation;
    }
    public void setObservation(String observation) {
        this.observation = observation;
    }
}

