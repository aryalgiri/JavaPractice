/*     Create a class BankAccount with methods to withdraw funds, deposit funds, display account information such as account number and balance
        The user can open a bank account providing the following information:
        •	name and initial balance
        •	name only (initial balance set to 0 in that case)
        Account number should be assigned in the constructor based on the value in the static field of the class.
        Overload the withdraw method with one that also takes a fee and deducts that fee from the account.
        Overload the deposit method with one that also takes an interest and increases all the balance in the account by that percent.
        After every transaction account number and balance should be displayed.
        In the main method create several BankAccount objects for testing purposes, deposit and withdraw funds from them in all possible ways.*/

package Lab1;

public class BankAccount {

    private final String name;
    private double initialBalance;
    private double finalBalance;
    private final int accountNum;
    private static int accountNumber = 1001;
    public BankAccount(String name) {
        this.name = name;
        this.initialBalance = this.finalBalance=0;
        this.accountNum=accountNumber++;
        displayInfo();
    }

    public void withdrawFunds(double withdrawAmount) {
        initialBalance=finalBalance; // updates the balance after each transaction
        if (withdrawAmount<=initialBalance) {
            finalBalance = initialBalance - withdrawAmount;
        }else{
            System.out.println("Transaction Denied: Insufficient balance!!!");
            System.out.println("+++++++++++++++++++++++");
        }
        displayInfo1();
    }

    public void withdrawFunds(double withdrawAmount, double fee) {
        initialBalance=finalBalance;
        if (withdrawAmount<=initialBalance) {
            finalBalance = initialBalance - withdrawAmount-fee;
        }else{
            System.out.println("Transaction Denied: Insufficient balance!!!");
            System.out.println("+++++++++++++++++++++++");
        }
        displayInfo1();
    }

    public void depositFunds(double depositAmount) {
        initialBalance=finalBalance;
        finalBalance = initialBalance + depositAmount;
        displayInfo1();

    }

    public void depositFunds(double depositAmount, double interestRate) {
        initialBalance=finalBalance;
        finalBalance = (initialBalance + depositAmount) * (1+interestRate / 100);
        displayInfo1();

    }

    public void displayInfo() {

        System.out.println("Account name: " + name);
        System.out.println("Account number: " + accountNum);
        System.out.println("Opening balance: $" + initialBalance);
        System.out.println("==========================");
    }

    public void displayInfo1() {

        System.out.println("Account name: " + name);
        System.out.println("Account number: " + accountNum);
        System.out.println("Last balance: $" + initialBalance);
        System.out.println("Current balance: $" + finalBalance);
        System.out.println("==========================");
    }
}