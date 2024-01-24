
package banksystem;

import java.text.DecimalFormat;


public class BankAccount {
    
    private double balance;
        
    public BankAccount(){
        balance=0;
    }
    
    public BankAccount(double amount){
        balance = amount;
    }
    
    public void displayBalance(){
        System.out.println("Balance: £" + roundMoney(balance));
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public void withdraw(double amount){
        balance -= amount;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String roundMoney(double amount) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(amount);
    }
    
}
