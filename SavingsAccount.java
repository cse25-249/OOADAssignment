
public class SavingsAccount extends Account {

    private final double interestRate = 0.0005;

    public SavingsAccount(
            String accountNumber,
            double balance,
            String branch) {

        super(accountNumber, balance, branch);
    }

   
    @Override
    public void withdraw(double amount) {

        throw new UnsupportedOperationException(
            "Withdrawals are not allowed from a Savings Account."
        );
    }

    
    @Override
    public double calculateInterest() {

        return getBalance() * interestRate;
    }

    @Override
    public String getAccountType() {

        return "Savings Account";
    }
}

