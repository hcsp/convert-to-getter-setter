package com.github.hcsp.encapsulation;

public class Cat {
    /** 猫咪的名字 */
    private String name;
    /** 猫咪的年龄 */
    private int age;
    /** 猫咪是否萌，true为萌，false为不萌 */
    private boolean cute;

    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(int age){
        return age;
    }
    public void setCute(boolean cute){
        this.cute=cute;
    }
    public boolean isCute(boolean cute){
        return  cute;
    }
}
