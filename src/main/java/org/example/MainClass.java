package org.example;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        // allows user to type int values (this case doubles for GPA)
        Scanner scan = new Scanner(System.in);


        Student std1 = new Student("James", 20, 3.5);

        // Name, Age, GPA, and credits held by a freshman student
        Student enter_freshman = new Freshman("James", 20, 3.6, 48);

        // Name, Age, GPA, and credits held by a senior student
        Student enter_senior = new Senior("John", 30, 3.0, 90);


        // allows to enter GPA for freshman
        System.out.println("Enter freshman students GPA: ");
        double GPA1 = scan.nextDouble();
        enter_freshman.setGPA(GPA1);

        // allows to enter GPA for senior
        System.out.println("Enter senior students GPA: ");
        double GPA2 = scan.nextDouble();
        enter_senior.setGPA(GPA2);

        // separates outputs for Name, age, entered GPA, and credits
        System.out.println(enter_freshman);
        System.out.println("GPA: " + enter_freshman.getGPA());

        System.out.println("**************************************");
        System.out.println(enter_senior);
        System.out.println("GPA: " + enter_senior.getGPA());

        // sample student print
        //System.out.println("**************************************");
        //System.out.println(std1);

    }

}

// ToDo 5: Fix the error (complete)

// ToDo 6: Fix the constructor of the Student class (complete)

// Todo 7: Create two classes for Freshman and Senior (complete)

// ToDo 8: The senior class should have a minimum of 85 credits (complete)

// ToDo 9: Add a toString method for the Student class (complete)

// ToDo 10: Add a toString method for the Freshman class (complete)

// ToDo 11: Add a toString method for the Senior class (complete)

// ToDo 12: Set the gpa of the student using the scanner and user
// 			input and then print the output. (Complete)

// ToDo 13: add comments and explain your code (complete)

// ToDo 14: submit using a pull request.