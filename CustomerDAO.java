import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {

    public boolean saveCustomer(CustomerRegistration customer) {

        String sql = "INSERT INTO customers " +
                "(customer_id, first_name, surname, national_id, " +
                "phone_number, email, address, customer_type) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, customer.getCustomerId());
            pstmt.setString(2, customer.getFirstName());
            pstmt.setString(3, customer.getSurname());
            pstmt.setString(4, customer.getNationalId());
            pstmt.setString(5, customer.getPhoneNumber());
            pstmt.setString(6, customer.getEmail());
            pstmt.setString(7, customer.getAddress());
            pstmt.setString(8, customer.getCustomerType());

            return pstmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Customer saving failed: " + e.getMessage());
            return false;
        }
    }
}


