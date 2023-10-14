package org.example;

public class Freshman extends Student {

    // adding credit member
    private int credits;
    // set all parameters for freshman student
    public Freshman(String name, int age, double GPA, int credits) {
        super(name, age, GPA);
        this.credits = credits;
    }
    // getter/setters for credits used in Scanner
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    // String information for freshman student
    @Override
    public String toString() {
        return "Freshman Student name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Credits: " + credits ;
    }
}