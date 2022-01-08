import java.util.Scanner;

//Finding Sum of all elements.
/* public class FindArray {
    public static void main(String args[]) {
        int A[] = { 2, 3, 4, 6, 9, 1 };
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];

        }
        System.out.println("Sum of all elements is\t" + sum);
        System.out.println(A.length);
    }

} */

//using for each loop
/* public class FindArray {
    public static void main(String args[]) {
        int A[] = { 2, 3, 4, 6, 9, 1 };
        int sum = 0;
        for (int x : A) {
            sum = sum+x;
        }
        System.out.println("Sum of all elements is\t" + sum);
    }}

 */

//Searching An Element
class FindArray{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int A[] = { 2, 3, 4, 6, 9, 1 };
  int key;

System.out.println("Enter a key");
key=sc.nextInt();

    for(int i=0;i<A.length;i++){
if (key==A[i]) 
{
    System.out.println("Element Found at:"+i);
    System.exit(0);
}
    }
    System.out.println("Not Found");
}
}
