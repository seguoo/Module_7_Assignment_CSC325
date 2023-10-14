package org.example;
/**
 *
 * @author MoaathAlrajab
 */
// student class placed as child of Human class using "extends"
public class Student extends Human {
    // added field for GPA, also adding getters and setters
    public double GPA;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student(String name, int age, double GPA) {
        super(name, age);
        this.GPA = GPA;
    }
    /*  resulting errors --> added setters/getting methods
           getAddress and setAddress
    */
    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }
    // String to print GPA results
    @Override
    public String toString() {
        return "Student name: " +
                name + "\n" +
                "Age: " + age + "\n" +
                "GPA: " + GPA;

    }
    // ToDo 1: Make this class a child of Human (complete)

    // ToDo 2: Fix the resulting errors (complete)

    // ToDo 3: Add a field for GPA and create a setter and a getter (complete)

    // ToDo 4: Add comments to your code (complete))

}
// TODO 4: added comments for class
