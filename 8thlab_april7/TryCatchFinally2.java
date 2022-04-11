//2. Write a Java program to illustrate try..catch..finally block. Extend this program to justify
//that a subclass exception must appear before super-class exception.

import java.util.*;

public class TryCatchFinally2 {
    public static void main(String args[]) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e2) {
            System.out.println("Exception in subclass -> " + e2);
        } catch (Exception e) {
            System.out.println("Exception in superclass -> " + e);
        } finally {
            System.out.println("Finally Block -> this block always executes even after error.");
        }

    }
}