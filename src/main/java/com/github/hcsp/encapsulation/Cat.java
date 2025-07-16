package com.github.hcsp.encapsulation;

public class Cat {
    private String name;
    private int age;
    private boolean cute;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int theAge){
        this.age = theAge;
    }

    public boolean isCute(){
        return true;
    }

    public void setCute(boolean cutee){
        this.cute = true;
    }
}
