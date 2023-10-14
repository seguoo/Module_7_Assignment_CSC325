package org.example;

public class Senior extends Student{
    // adding credit member
    private int credits;

    // set all parameters for senior student
    public Senior(String name, int age, double GPA, int credits) {
        super(name, age, GPA);
        // sets 85 or more credits for a student to be considered a senior
        if (credits > 85)
            this.credits = credits;
        else {
            System.out.println("You are not a Senior. ");
        }
    }
    // getter/setters for credits used in Scanner
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    // String information for senior student
    @Override
    public String toString() {
        return "Senior Student name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Credits: " + credits ;
    }
}
