public class TestConnection {

    public static void main(String[] args) {

        CustomerRegistration customer =
                new CustomerRegistration(
                        "C001",
                        "John",
                        "Smith",
                        "123456789",
                        "71234567",
                        "john@gmail.com",
                        "Gaborone",
                        "Individual"
                );

        CustomerDAO dao = new CustomerDAO();

        if (dao.saveCustomer(customer)) {
            System.out.println("Customer saved successfully!");
        } else {
            System.out.println("Customer was not saved.");
        }
    }
}