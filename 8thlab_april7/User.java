/* Write a program to perform following operations on user entered strings –

i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string   */

import java.util.*;

class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a string");
        s = sc.nextLine();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int t = ch;
            if (t >= 65 && t <= 90)
                ch = (char) (t + 32);
            else if (t >= 97 && ch <= 122)
                ch = (char) (t - 32);
            s2 += ch;
        }
        System.out.println("The string after changing the case is " + s2);
        s2 = "";
        for (int i = s.length() - 1; i >= 0; i--)
            s2 += s.charAt(i);
        System.out.println("The string after reversing is " + s2);
        String s3;
        System.out.println("Enter the second string for comparison");
        s3 = sc.nextLine();
        System.out.println("The difference between ASCII value is " +
                s.compareTo(s3));
        System.out.println("Enter the string to be inserted into first string");
        s3 = sc.nextLine();
        System.out.println("The two strings after insertion is " + (s + s3));
        sc.close();
    }
}