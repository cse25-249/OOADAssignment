import java.util.ArrayList;
import java.util.List;

public class BankingSystem {

    private final List<Customer> customers;

    public BankingSystem() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException(
                "Customer cannot be empty."
            );
        }

        customers.add(customer);
    }

      public Customer findCustomer(String customerId) {

        for (Customer customer : customers) {

            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }

        return null;
    }

        public void deposit(String customerId,
                        String accountNumber,
                        double amount) {

        Customer customer = findCustomer(customerId);

        if (customer == null) {
            throw new IllegalArgumentException(
                "Customer not found."
            );
        }

        for (Account account : customer.getAccounts()) {

            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }

        throw new IllegalArgumentException(
            "Account not found."
        );
    }

    
    public void payMonthlyInterest() {

        for (Customer customer : customers) {

            for (Account account : customer.getAccounts()) {

                double interest = account.calculateInterest();

                if (interest > 0) {
                    account.deposit(interest);
                }
            }
        }
    }
}
