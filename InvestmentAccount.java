public class InvestmentAccount extends Account {

    private final double interestRate = 0.05;

    public InvestmentAccount(
            String accountNumber,
            double initialDeposit,
            String branch) {

        super(accountNumber, validateInitialDeposit(initialDeposit), branch);
    }

    private static double validateInitialDeposit(double amount) {
        if (amount < 500) {
            throw new IllegalArgumentException(
                "Initial deposit must be at least BWP 500."
            );
        }

        return amount;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public String getAccountType() {
        return "Investment Account";
    }
}
