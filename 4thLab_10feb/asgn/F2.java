import java.util.*;
public class F2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0;
        int odd=0;
        for(int i =0; i< 10; i++){
            int num = sc.nextInt();
            if(num%2 == 0){
                even=even+1;
            }else{
                odd=odd+1;
            }
        }
        System.out.println("the total even number is "+even+"\nthe total odd no is "+odd);;
    }
    
}
