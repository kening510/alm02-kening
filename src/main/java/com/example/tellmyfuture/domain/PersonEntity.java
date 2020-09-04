package com.example.tellmyfuture.domain;



import java.io.Serializable;


public class PersonEntity implements Serializable {


    private Long id;
    private String name;
    private int age;
    private String gender;


    public PersonEntity(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this. gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
