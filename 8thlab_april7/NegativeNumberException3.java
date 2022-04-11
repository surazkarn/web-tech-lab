/* 3. Write a Java program to create user defined exceptions called NegativeNumberException.
Create a Java class which has a method called ProcessInput(). This method checks the
number entered by the user. If the entered number is negative then throw an user defined
exception called NegativeNumberException, otherwise it displays the double value of the
entered number. */

class MyException extends Exception {
    public MyException(String str) {
        System.out.println(str);
    }
}

class NegativeNumberException3 {
    public static void main(String args[]) {
        int a = -5;
        try {
            if (a < 0) {
                throw new MyException("Number is negative");
            } else {
                System.out.println("Double Number = " + (2 * a));
            }
        } catch (Exception e) {
            System.out.println("Caught Exception Negative Number");
        }
    }
}
