
/* 2. Illustrate the execution of constructors in multi-level inheritance with three Java classes –
plate(int length, int width), box(length, width, height), wood box (length, width, height,
thick).
Hints:
Class plate{
Int length, width;
Plate(int a, int b){
Length= a;
Width=b;
}
}
Class box extends plate{
Int length, width, hight;
box(int a, int b, int c){
super(a,b);
hight=c;
}
} */

import java.util.*;

class Plate {
    int length, width;
    public Scanner s = new Scanner(System.in);

    public Plate() {
        length = s.nextInt();
        width = s.nextInt();
        System.out.println(("the length is " + length + "\n the breadth is " + width));
    }
}

class Plates extends Plate {
    public Plates() {
        System.out.println(("the length is " + (float) length + "\n the breadth is " + width));
    }
}

class Box extends Plates {
    int height;

    public Box() {
        height = s.nextInt();
        System.out.println("the length is " + (float) length + "\n the breadth is " + width + "\nheight is " + height);
    }
}

class WoodBox extends Box {
    int thick;

    public WoodBox() {
        thick = s.nextInt();
        System.out.println("the length is " + (float) length + "\n the breadth is " + width + "\nheight is " + height);
        System.out.println("the thick is " + thick);
    }
}

public class Lab6Q2 {
    public static void main(String[] ags) {

        WoodBox w = new WoodBox();
    }
}