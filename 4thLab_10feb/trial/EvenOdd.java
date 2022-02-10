import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
int even = 0, odd = 0;
for (int i = 0; i < 10; i++) {
int a = Integer.parseInt("i");
if (a % 2 == 0)
even++;
else
odd++;
}
System.out.println("Even Numbers : " + even);
System.out.println("Odd Numbers : " + odd);

    }
}
