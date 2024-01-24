package banksystem;

/**
 * Author: Lauren F
 * Date: 23/11/22
 * Notes: This will be used to make a bank system with accounts.
 */
public class BankSystem {

    public static void main(String[] args) {
        BankAccount ba;
       
        ba = new OverdraftAccount (300.00, -100.00);
        System.out.println("Balance: £" + ba.getBalance());
        ba.withdraw(10.00);
        System.out.println("Balance: £" + ba.getBalance());
        
        ba = new CurrentAccount();
        ba.deposit(300.00);
        ba.displayBalance();
    }
    
}
