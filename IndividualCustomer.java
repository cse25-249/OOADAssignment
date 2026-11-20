
public class IndividualCustomer extends Customer {

    private final String firstName;
    private final String surname;
    private final boolean employed;

    public IndividualCustomer(
            String customerId,
            String firstName,
            String surname,
            String address,
            String phoneNumber,
            boolean employed) {

        super(customerId, address, phoneNumber);

        this.firstName = firstName;
        this.surname = surname;
        this.employed = employed;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isEmployed() {
        return employed;
    }

    @Override
    public String getCustomerType() {
        return "Individual Customer";
    }
}
