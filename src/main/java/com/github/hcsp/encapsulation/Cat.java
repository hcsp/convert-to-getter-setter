package com.github.hcsp.encapsulation;

public class Cat {
    /** 猫咪的名字 */
    private String name;
    /** 猫咪的年龄 */
    private int age;
    /** 猫咪是否萌，true为萌，false为不萌 */
    private boolean cute;


    public String setName(String name){
        this.name = name;
        return name;
    }
    public String getName(){
        return name;
    }

    public int setAge(int age){
        this.age= age;
        return age;
    }

    public int getAge(){
        return age;
    }

    public boolean setCute(boolean cute){
        this.cute = cute;
        return cute;
    }

    public boolean isCute(){
        return true;
    }

}
