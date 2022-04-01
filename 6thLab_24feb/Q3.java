/*3. Write a program in java to define a class Shape which has data member „area‟ and a
member function showArea(). Derive two classes Circle and Rectangle from Shape class. Add
appropriate data members and member functions to calculate and display the area of Circle
and Rectangle.*/

import java.util.*;

class Shape {
    public float area;

    public void showArea() {

    }
}

class Circle extends Shape {
    public Scanner s = new Scanner(System.in);
    float r;

    public void showArea() {
        System.out.println("enter the radius of circle");
        r = s.nextFloat();
        System.out.println("the area of circle is :" + 3.14 * Math.pow(r, 2));
    }
}

class Rectangle extends Shape {
    public Scanner s = new Scanner(System.in);
    float l, b;

    public void showArea() {
        System.out.println("enter the length and breadth of rectangle ");
        l = s.nextFloat();
        b = s.nextFloat();
        System.out.println("the area of rectangle is: " + l * b);
    }
}

public class Q3 {
    public static void main(String asd[]) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.showArea();
        r.showArea();
    }
}
