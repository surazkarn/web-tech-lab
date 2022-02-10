import java.util.Scanner;

public class F3 {
    public static void main(String[] args) {
        System.out.println("Choose menu: ");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        Scanner cin = new Scanner(System.in);
        int menu = cin.nextInt();
        Calculate cal = new Calculate();
        switch (menu) {
            case 1: {
                cal.Circle();
                break;
            }
            case 2: {
                cal.Square();
                break;
            }
            case 3: {
                cal.Triangle();
                break;
            }
            default: {
                System.out.println("Wrong menu...");
            }
        }
        cin.close();
    }
}

class Calculate {
    Scanner cin = new Scanner(System.in);

    void Triangle() {
        System.out.print("Enter height: ");
        int height = cin.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = cin.nextInt();
        System.out.println("Area = " + 0.5 * height * breadth);
    }

    void Square() {
        System.out.print("Enter height: ");
        int height = cin.nextInt();
        System.out.println("Area = " + height * height);
    }

    void Circle() {
        System.out.print("Enter radius: ");
        int radius = cin.nextInt();
        System.out.println("Area = " + 3.14 * radius * radius);
    }
}