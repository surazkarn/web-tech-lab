/* 1. Write a Java program to generate an nullpointerexception and handle it using catch
statement. */

/* NullPointerException is a RuntimeException. 
In Java, a special null value can be assigned to an object reference. 
NullPointerException is thrown when program attempts to use an object reference that has the null value. */

public class Nullpointerexception1 {
    public static void main(String[] args) {

        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr is null using try catch.
        try {
            if ("suraj".equals(ptr))
                System.out.print("Is Same");
            else
                System.out.print("Is Not Same");
        } catch (NullPointerException e) {
            System.out.print("Caught NullPointerException");
        }
    }
}
