
import java.util.Scanner;

public class First {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st int value: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd int value: ");
        int b = sc.nextInt();
        System.out.print("Enter 1st float value: ");
        float c = sc.nextFloat();
        System.out.print("Enter 2nd float value: ");
        float d = sc.nextFloat();
        System.out.println("sub(int,int) = " + sub(a, b));
        System.out.println("sub(int) = " + sub(a));
        System.out.println("sub(float,float) = " + sub(c, d));
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static float sub(float a, float b) {
        return a - b;
    }

    static int sub(int b) {
        int a = 10;
        return a - b;
    }
}
