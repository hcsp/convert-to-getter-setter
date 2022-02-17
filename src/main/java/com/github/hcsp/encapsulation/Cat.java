package com.github.hcsp.encapsulation;

public class Cat {
    /** 猫咪的名字 */
    public String name;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isCute() {
        return cute;
    }

    /** 猫咪的年龄 */
    public int age;
    /** 猫咪是否萌，true为萌，false为不萌 */
    public boolean cute;
}
