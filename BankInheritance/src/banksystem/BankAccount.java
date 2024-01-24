package banksystem;

import java.text.DecimalFormat;
/**
 * Author: Lauren F
 * Date: 23/11/22
 * Notes: This is an account.
 */
public abstract class BankAccount {
    private double balance;
    
    public BankAccount(){
        balance=0;
    }

    public BankAccount(double amount){
        balance = amount;
    }
    
    public abstract void displayBalance();

    public void deposit(double amount){
        balance += amount;
    }
    
    public int withdraw(double amount){
        balance -= amount;
        return 1;
    }
    
    public double getBalance() {
        return balance;
    }

    public String roundMoney(double amount){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(amount);
    }
}
