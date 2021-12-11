package com.github.hcsp.encapsulation;

public class Cat {
    /** 猫咪的名字 */
    private String name;
    /** 猫咪的年龄 */
    private int age;
    /** 猫咪是否萌，true为萌，false为不萌 */
    private  boolean cute;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean isCute(){
        return cute;
    }
    public String setName(String name){
        return this.name=name;
    }
    public int setAge(int age){
        return this.age=age;
    }
    public boolean setCute(boolean cute){
        return this.cute=cute;
    }
}
