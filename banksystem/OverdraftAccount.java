
package banksystem;


public class OverdraftAccount extends BankAccount {
    
    private double overdraftLimit;
    
    public OverdraftAccount(){
        super();
        overdraftLimit = 100D;
    }
    
    public OverdraftAccount(double amount, double overdraftLimit){
        super(amount);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    
}
