package com.github.hcsp.encapsulation;

public class Cat {
    /** 猫咪的名字 */
    private String name;
    /** 猫咪的年龄 */
    private int age;
    /** 猫咪是否萌，true为萌，false为不萌 */
    private boolean cute;
    private Object String;

    public Cat getString() {
        return (Cat) String;
    }

    public void setString(Cat string) {
        String = string;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }
}
