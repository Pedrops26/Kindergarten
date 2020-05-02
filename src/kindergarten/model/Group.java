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
public class Group {
    private int id;
    private String groupAspect;
    private int totalStudents;
    private Teacher teacher;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getGroupAspect() {
        return groupAspect;
    }
    public void setGroupAspect(String groupAspect) {
        this.groupAspect = groupAspect;
    }

    public int getTotalStudents() {
        return totalStudents;
    }
    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
