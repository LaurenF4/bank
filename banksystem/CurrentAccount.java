
package banksystem;

public class CurrentAccount extends BankAccount {
    
    private static double interestRate = 0.05;
    
    public CurrentAccount(){
        super();
    }
    
    public CurrentAccount(double amount){
        super(amount);
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        CurrentAccount.interestRate = interestRate;
    }
}
