package org.example;

public class Father extends Grandfather{
    private String hobby;



    public Father(int age, String name,Professions professions,Home address,String hobby) {
        super(age, name,professions,address);
        this.hobby=hobby;

    }
    public String getHobby() {
        return hobby;
    }
    public void Parting(){
        System.out.println("Приятно было познакомиться, до свидания!");
    }
    public final void Parting(String parting){
        System.out.println(parting);
    }
    public String getInfo() {

        return "Age: " + getAge() +
                "\nName: " + getName() +
                "\nProfessions: " + getProfessions() +
                "\nAddress: " + getAddress().getHome() +
                "\nHobby: " + getHobby();
    }



}
