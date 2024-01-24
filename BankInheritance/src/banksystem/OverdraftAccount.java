package banksystem;
/**
 * Author: Lauren
 * Date: 30/11/22
 * Notes: This is my overdraft account. I don't know what this means
 */
public class OverdraftAccount extends BankAccount {
    private double overdraftLimit;

   public OverdraftAccount(){
       super();
       overdraftLimit = 100;
   }
   
   public OverdraftAccount(double amount, double overdraftLimit){
       super(amount);
       this.overdraftLimit = overdraftLimit;
   }
   
   public double getOverdraftlimit(){
       return overdraftLimit;
   }
   
   public void setOverdraftLimit(double overdraftlimit){
       this.overdraftLimit = overdraftLimit;
   }
   
   @Override 
   public double getBalance(){
       return Math.abs(super.getBalance() + overdraftLimit);
   }
   
   @Override
   public int withdraw(double amount){
       
       if((getBalance()- amount) < overdraftLimit){
            System.out.println("Sorry, you insufficient funds.");
            return 0;
       } else{
           super.withdraw(amount);
           System.out.println("You have withdrawn £" + amount + ".");
           System.out.println("Overdraft Limt: £" + Math.abs(overdraftLimit) + ".");
           System.out.println("You can spend: £" + getBalance() + ".");
           return 1;
       }
   }
   @Override
   public void displayBalance(){
       System.out.println("£"  + getBalance() + " in your overdraft account.");
   }
}
