package com.github.hcsp.encapsulation;

public class Cat {
    /** 猫咪的名字 */
    private String name;
    /** 猫咪的年龄 */
    private age;
    /** 猫咪是否萌，true为萌，false为不萌 */
    private boolean cute;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }
}
