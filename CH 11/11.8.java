package Programming_exercises;
public class Week_5_11_8 {
import tools.account
/**
* other students data or code input
* from exercise 9.7 as per instructor. 
* imported via tools.account
*/

    public static void main(String[] args) {
        Account account = new Account(1579, 1000);
        account.setAnnualInterestRate(1.5);
        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Withdrawing $10...");
        account.withdraw(10);
        System.out.println("Depositing $30...");
        account.deposit(30);
        System.out.println("Displaying updated info.");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Monthly interest rate: " + account.getMonthlyInterestRate());
        System.out.println("Date account was created: " + account.getDateCreated());
    }
}

    public static void main(String[] args) {

        Account account = new Account("Brian", 1579, 1000);
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(10);
        account.withdraw(4);
        account.withdraw(2);
        System.out.println(account);
    }
}
