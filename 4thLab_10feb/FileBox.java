import java.util.*;
class Box{
    int volume(int a , int b , int c){
        return(a*b*c);
    }
}

public class FileBox {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int convert1 = sc.nextInt();
        int convert2= sc.nextInt();
        int convert3 = sc.nextInt();

        Box box = new Box();
        int result = box.volume(convert1, convert2, convert3);
        System.out.println(result);
    }
}