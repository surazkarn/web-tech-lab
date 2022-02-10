import java.util.Scanner;

class a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p,q,r;
        p=Integer.parseInt("4");
        q=Integer.parseInt("6");
        r=Integer.parseInt("7");

        if(p>=q && p>=r)
        System.out.println("Largest number:" +p);
        else if (q>=p&&q>=r)
        System.out.println("Largest number:" +q);
        else
        System.out.println("Largest number:" +r);

    }
}