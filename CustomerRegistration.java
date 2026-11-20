
public class CustomerRegistration {

    private final String customerId;
    private final String firstName;
    private final String surname;
    private final String nationalId;
    private final String phoneNumber;
    private final String email;
    private final String address;
    private final String customerType;

    public CustomerRegistration(
            String customerId,
            String firstName,
            String surname,
            String nationalId,
            String phoneNumber,
            String email,
            String address,
            String customerType) {

        this.customerId = customerId;
        this.firstName = firstName;
        this.surname = surname;
        this.nationalId = nationalId;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public boolean isValid() {
        return customerId != null && !customerId.trim().isEmpty()
                && firstName != null && !firstName.trim().isEmpty()
                && surname != null && !surname.trim().isEmpty()
                && nationalId != null && !nationalId.trim().isEmpty()
                && phoneNumber != null && !phoneNumber.trim().isEmpty()
                && email != null && !email.trim().isEmpty()
                && address != null && !address.trim().isEmpty()
                && customerType != null && !customerType.trim().isEmpty();
    }

    public Customer createCustomer() {

        if (!isValid()) {
            throw new IllegalArgumentException(
                    "Please complete all registration fields."
            );
        }

        if (customerType.equalsIgnoreCase("Individual")) {

            return new IndividualCustomer(
                    customerId,
                    firstName,
                    surname,
                    address,
                    phoneNumber,
                    false
            );

        } else if (customerType.equalsIgnoreCase("Corporate")) {

            return new CorporateCustomer(
                    customerId,
                    address,
                    phoneNumber,
                    firstName,
                    nationalId,
                    surname
            );
        }

        throw new IllegalArgumentException("Invalid customer type.");
    }
}
