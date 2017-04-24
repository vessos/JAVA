package staticIdAndInterestRate;


public class BankAccount {

    private static final double DEFAULT_INTEREST_RATE = 0.02;

    private static int accountCount;
    private static double currentInterestRate;

    private int id;
    private double balance;

    public BankAccount(){
        this.id = ++accountCount;
        currentInterestRate = DEFAULT_INTEREST_RATE;
    }

    public int getId(){
        return this.id;
    }

    public static void setInterestRate (double interestRate){
        currentInterestRate = interestRate;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public double getInterestRate(int years){
        return this.balance*currentInterestRate*years;
    }

    @Override
    public String toString() {
        return "ID"+this.id;
    }
}
