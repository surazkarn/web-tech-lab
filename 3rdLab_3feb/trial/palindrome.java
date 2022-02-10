public class palindrome {
    public static void main(String[] args) {

        int n=12321;

        int m=n;
        int ans = 0;
        while(m!=0){
            ans = ans*10 + m%10;
            m/=10;
        }
        if (ans==n)
            System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");

    }
}
