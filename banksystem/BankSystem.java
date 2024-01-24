/*
 * Author: Magnus Tullock
 * Date: 4/7/2019
 * Note: Bank System
 */
package banksystem;

public class BankSystem {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(50.00);
        ba.displayBalance();
        
        OverdraftAccount oa = new OverdraftAccount(200.00, -100.00);
        System.out.println("Balance: " + ba.roundMoney(oa.getBalance()));
        oa.withdraw(250);
        oa.withdraw(100);
        System.out.println("Balance: " + ba.roundMoney(oa.getBalance()));
        
        CurrentAccount ca = new CurrentAccount();
        ca.deposit(70.00);
        ca.displayBalance();
        
    }
    
}
