package banksystem;
/**
 * Author: Lauren
 * Date: 30/11/22
 * Notes: This is my overdraft account. WTF is that?
 */
public class CurrentAccount extends BankAccount {
    private static double intrestRate = 0.04;
    
    public CurrentAccount(){
        super();
    }
    
    public CurrentAccount(double amount){
        super(amount);
    }
    
    public static double getintrestRate(){
        return intrestRate;
    }

    public static void setintrestRate(double intrestRate) {
        CurrentAccount.intrestRate = intrestRate;
    }
    
    @Override
    public void deposit(double amount){
        double intrestAmount = (amount / 100)*intrestRate;
        super.deposit(amount + intrestAmount);
        System.out.println("Applying " + intrestRate + "% intrest.");
        System.out.println("£" + (amount + intrestAmount) + " deposited to account.");
        
        displayBalance();
        System.out.println("=============================");
    }
    
    @Override
    public int withdraw(double amount){
        if((getBalance() - amount) < 0){
            System.out.println("Sorry, you insufficient funds.");
            return 0;
        } else{
            super.withdraw(amount);
            System.out.println("You have withdrawn £" + amount + ".");
            return 1;
        }
    }
    
    @Override
    public void displayBalance(){
        System.out.println("£" + getBalance() + " in your current account.");
    }
}
