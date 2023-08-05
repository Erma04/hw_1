package org.example;

public class Grandfather {
    private int age;
    private String name;
    private Professions professions;
    private Home address;


    public Grandfather(int age, String name, Professions professions,Home address) {
        this.age = age;
        this.name = name;
        this.professions = professions;
        this.address=address;

    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Professions getProfessions() {
        return professions;
    }

    public Home getAddress() {
        return address;
    }



}
