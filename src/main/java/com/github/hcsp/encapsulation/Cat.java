package com.github.hcsp.encapsulation;

public class Cat {
    /** 猫咪的名字 */
    public String name;
    /** 猫咪的年龄 */
    public int age;

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }

    /** 猫咪是否萌，true为萌，false为不萌 */
    public boolean cute;
}
