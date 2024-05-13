package com.example.thymeleafDemo;

public class Personas {

    private  String name;
    private  int age;

    public Personas(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
