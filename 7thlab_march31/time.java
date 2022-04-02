
import java.util.Scanner;

interface Payment {
    void deduction();

    void bonus();

    void earning();
}

abstract class Manager implements Payment {
    Scanner input = new Scanner(System.in);
    double bs, da, hra, earning_val, deduction_val, bonus_val;

    Manager() {
        System.out.println("enter your basic salary");
        bs = input.nextInt();
    }

    public void earning() {
        earning_val = bs + 0.8 * bs + 0.15 * bs;
        System.out.println("Earning =" + earning_val);
    }

    public void deduction() {
        deduction_val = 0.12 * bs;
        System.out.println("Deduction =" +

                deduction_val);

    }

    public void bonus() {
    }
}

class Substaff extends Manager {
    public void bonus() {
        bonus_val = 0.12 * bs;
        System.out.println("Bonus =" + bonus_val);
    }
}

public class InterfaceThreeMeth {
    public static void main(String[] args) {
        Manager ob1 = new Manager();
        ob1.earning();
        ob1.deduction();
        Substaff ob2 = new Substaff();
        ob2.bonus();
    }
}
