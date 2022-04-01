
// 1. Write a program in java to input and display the details of n number of
// students having
// roll, name and cgpa as data members. Also display the name of the student
// having lowest
// cgpa.

import java.util.Scanner;

public class Q1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        student obj[] = new student[n];
        for (int i = 0; i < n; i++)
            obj[i] = new student();
        System.out.println("\nInput students: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            obj[i].input();
        }
        student lowest = new student();
        System.out.println("\nDisplaying students: ");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ": ");
            obj[i].output();
        }
        lowest.cgpa = 10;
        for (int i = 0; i < n; i++) {
            if (lowest.cgpa > obj[i].cgpa)
                lowest = obj[i];
        }
        System.out.println("\nDisplaying student with lowest cgpa: ");
        lowest.output();
    }
}

class student {
    Scanner sc = new Scanner(System.in);
    public String name;
    public int roll;
    public float cgpa;

    student() {
        name = "";
        roll = 0;
        cgpa = 0;
    }

    void input() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll: ");
        roll = sc.nextInt();
        System.out.print("Enter cgpa: ");
        cgpa = sc.nextFloat();
    }

    void output() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("CGPA: " + cgpa);
    }
}