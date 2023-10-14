package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
    protected String name;
    private String address;
    protected int age;

    // constructor that takes only two paras
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getAddress() ;

    public abstract void setAddress(String address);


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}