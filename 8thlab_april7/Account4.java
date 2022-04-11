/* 4. Write a JAVA program which has (i) A Class called Account that creates account with
500Rs minimum balance, a deposit() method to deposit amount, a withdraw() method to
withdraw amount and also throws LessBalanceException if an account holder tries to
withdraw money which makes the balance becomes less than 500Rs. (ii) A Class called
LessBalanceException which returns the statement that says withdraws amount (Rs) is not
valid. (iii) A Class which creates 2 accounts, both account deposit money and one account
tries to withdraw more money which generates a LessBalanceException take appropriate
action for the same.
 */

class MyException extends Exception {
    public MyException(String str) {
        System.out.println(str);
    }
}

class Account4 {
    public static void main(String args[]) {
        int current = 1000;
        try {
            int withdraw = 700;
            if ((current - withdraw) < 500) {
                throw new MyException("Withdraw Not possible as amount is not sufficient");
            } else {
                current -= withdraw;
                System.out.println("Amount successfully withdrawn, remaining balance = " + current);
            }
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }
}