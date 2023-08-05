package org.example;

public class Main {
    public static void main(String[] args) {

       Father father = new Father(48,"Mark",Professions.LAWYER,new Home("Lenina 32"),"Fishing");
        System.out.println(father.getInfo());
        father.Parting();
        System.out.println("-----------------------------");

       Son son = new Son(18,"Alex",Professions.PROGRAMMER,new Home("Lenina 32"),"Programming","Get up early");
        System.out.println(son.getInfo());
        son.Parting("До встречи!");
        System.out.println("-----------------------------");

        Son son2 = new Son(25,"Arthur",Professions.DOCTOR,new Home("Repina 108"),"Dance","Meditate");
        System.out.println(son2.getInfo());
        son2.Parting("Увидимся!");






    }
}