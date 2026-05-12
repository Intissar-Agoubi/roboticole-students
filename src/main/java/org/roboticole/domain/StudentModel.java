package org.roboticole.domain;

public class StudentModel {
    private String name ;
    private String surname ;
    private int age ;
    private String id ;
    private String course ;

    public StudentModel(String name, String surname, int age, String id, String course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
