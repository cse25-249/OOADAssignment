
public class ChequeAccount extends Account {

    private String company;
    private String companyAddress;

    public ChequeAccount(
            String accountNumber,
            double balance,
            String branch,
            boolean employed,
            String company,
            String companyAddress) {

        super(accountNumber, balance, branch);

        if (!employed) {
            throw new IllegalArgumentException(
                "Customer must be employed to open a Cheque Account."
            );
        }

        if (company == null || company.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Company name is required."
            );
        }

        if (companyAddress == null ||
            companyAddress.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Company address is required."
            );
        }

        this.company = company;
        this.companyAddress = companyAddress;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    @Override
    public String getAccountType() {
        return "Cheque Account";
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }
}
