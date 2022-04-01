

import java.util.*;

class Rectangle{
    private float l,b;
    public Scanner sc=new Scanner(System.in); 
    public float area,perimeter;
    public void read(){
        System.out.println("enter length and breadth: ");
        l=sc.nextFloat();
        b=sc.nextFloat();
    }
    public void calculate(){
         area=l*b;
         perimeter=2*(l+b);
    }
    public void display(){
        System.out.println("area of rectangle is : "+area);
        System.out.println("perimeter of rectangle is : "+perimeter);
    }
}
public class Second{
    public static void main(String ags[]){
        Rectangle rect=new Rectangle();
        rect.read();;
        rect.calculate();
        rect.display();
    }
}