
/*4. Write a program to create an Account class containing acc_no, balance as data members
and disp() to display the details. Inherit it in Person class with all mentioned data members
and functions. Person class also has name and aadhar_no as extra data members of its own.
Override disp() function. Create 3 persons‟ details. */

import java.util.*;

class account {
    String name, address, type;
    int accno, bal;

    account(String n, int no, int b) {
        name = n;
        accno = no;
        bal = b;
    }

    account(String n, int no, String addr, String t, int b) {
        name = n;
        accno = no;
        address = addr;
        type = t;
        bal = b;
    }

    void deposite(int a) {
        bal += a;
    }

    void withdraw(int a) {
        bal -= a;
    }

    int getbalance() {
        return (bal);
    }

    void show() {
        System.out.println("________");
        System.out.println(" ACCOUNT DETAILS");
        System.out.println("------------------------");
        System.out.println("Name : " + name);
        System.out.println("Account No : " + accno);
        System.out.println("Address : " + address);
        System.out.println("Type : " + type);
        System.out.println("Balance : " + bal);
        System.out.println("------------------------");
    }
}

public class Lab6q4 {
    public static void main(String arg[])
            throws Exception {
        account a1 = new account("SURAJ", 555, 5000);
        account a2 = new account("RAMESH", 666, "KHANAR", "Current account", 1000);
        account a3 = new account("RUPESH", 777, "BIRGUNJ", "Current account", 2000);
        a1.address = "BHUBNESWAR";
        a1.type = "fixed deposite";
        a1.deposite(5000);
        a2.withdraw(350);
        a2.deposite(a2.getbalance());
        a1.show();
        a2.show();
        a3.show();
    }
}