import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

    private final String customerId;
    private final String address;
    private final String phoneNumber;

    private final List<Account> accounts;

    public Customer(String customerId,
                    String address,
                    String phoneNumber) {

        this.customerId = customerId;
        this.address = address;
        this.phoneNumber = phoneNumber;

        accounts = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        if (account == null) {
            throw new IllegalArgumentException(
                "Account cannot be empty."
            );
        }

        accounts.add(account);
    }

    public abstract String getCustomerType();
}
