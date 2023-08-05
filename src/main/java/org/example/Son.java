package org.example;

public final class Son extends Father {
    private String habits;


    public Son(int age, String name, Professions professions,Home address,String hobby,String habits) {
        super(age, name, professions,address,hobby);
        this.habits=habits;
    }

    public String getHabits() {
        return habits;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nHabits: "+getHabits();
    }
}
