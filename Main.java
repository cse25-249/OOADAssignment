public class Main {

    public static void main(String[] args) {

        
        BankingSystem bank = new BankingSystem();

       
        IndividualCustomer customer1 = new IndividualCustomer(
                "C001",
                "Patience",
                "Mokgosi",
                "Gaborone",
                "71234567",
                true
            );

              CorporateCustomer customer2 =
            new CorporateCustomer(
                "C002",
                "Francistown",
                "72345678",
                "ABC Company",
                "BW12345",
                "John Smith"
            );

        SavingsAccount savings =
            new SavingsAccount("S001", 1000, "Gaborone");

        InvestmentAccount investment =
            new InvestmentAccount("I001", 500, "Gaborone");

        ChequeAccount cheque =
            new ChequeAccount(
                "CH001",
                2000,
                "Gaborone",
                customer1.isEmployed(),
                "ABC Company",
                "Gaborone"
            );

       
        SavingsAccount companySavings =
            new SavingsAccount("S002", 5000, "Francistown");

        customer1.addAccount(savings);
        customer1.addAccount(investment);
        customer1.addAccount(cheque);

        customer2.addAccount(companySavings);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

             System.out.println("BEFORE TRANSACTIONS");

        System.out.println(
            "Savings balance: BWP " + savings.getBalance()
        );

        System.out.println(
            "Investment balance: BWP " + investment.getBalance()
        );

        bank.deposit("C001", "S001", 500);

       
        bank.payMonthlyInterest();

        
        System.out.println("\nAFTER TRANSACTIONS");

        System.out.println(
            "Savings balance: BWP " + savings.getBalance()
        );

        System.out.println(
            "Investment balance: BWP " + investment.getBalance()
        );

        System.out.println(
            "Cheque balance: BWP " + cheque.getBalance()
        );

        System.out.println(
            "Company savings balance: BWP "
            + companySavings.getBalance()
        );
    }
}
