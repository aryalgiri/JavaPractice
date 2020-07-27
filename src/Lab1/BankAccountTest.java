package Lab1;

public class BankAccountTest {
    public static void main(String[] args) {
      BankAccount ac1=new BankAccount("Ram");
        BankAccount ac2=new BankAccount("Hari");
        BankAccount ac3=new BankAccount("Shyam");
        ac1.depositFunds(1000);
        ac1.withdrawFunds(500);
        ac1.depositFunds(1500,20);

        ac2.depositFunds(500);
        ac2.depositFunds(1500,10);
        ac2.withdrawFunds(500,100);
        ac2.withdrawFunds(2000);
        ac2.withdrawFunds(2400,100);

        ac3.withdrawFunds(500);
        ac3.depositFunds(1000);
        ac3.depositFunds(1500,20);
        ac3.withdrawFunds(500,100);

    }
}
