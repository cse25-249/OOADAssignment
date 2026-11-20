public class CorporateCustomer extends Customer {

    private final String companyName;
    private final String registrationNumber;
    private final String contactPerson;

    public CorporateCustomer(
            String customerId,
            String address,
            String phoneNumber,
            String companyName,
            String registrationNumber,
            String contactPerson) {

        super(customerId, address, phoneNumber);

        this.companyName = companyName;
        this.registrationNumber = registrationNumber;
        this.contactPerson = contactPerson;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    @Override
    public String getCustomerType() {
        return "Corporate Customer";
    }
}
