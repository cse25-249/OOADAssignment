import java.awt.*;
import javax.swing.*;

public class BankingApp extends JFrame {

    private final BankingSystem bankingSystem = new BankingSystem();

    private JTextField usernameField;
    private JPasswordField passwordField;

    public BankingApp() {

        setTitle("Banking System");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 244, 248));

        
        JLabel title = new JLabel("BANKING SYSTEM");
        title.setBounds(100, 50, 300, 40);
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setForeground(new Color(20, 45, 80));
        title.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel subtitle = new JLabel("Welcome! Please login");
        subtitle.setBounds(100, 95, 300, 30);
        subtitle.setFont(new Font("Arial", Font.PLAIN, 15));
        subtitle.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(75, 165, 350, 25);
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 14));

        usernameField = new JTextField();
        usernameField.setBounds(75, 195, 350, 40);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 15));

      
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(75, 255, 350, 25);
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));

        passwordField = new JPasswordField();
        passwordField.setBounds(75, 285, 350, 40);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));

   
        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(75, 355, 350, 45);
        loginButton.setBackground(new Color(20, 45, 80));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Arial", Font.BOLD, 15));
        loginButton.setFocusPainted(false);

       
        JButton registerButton = new JButton("REGISTER");
        registerButton.setBounds(75, 415, 350, 40);
        registerButton.setFont(new Font("Arial", Font.BOLD, 14));

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this,
                    "Please enter your username and password."
                );
            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "Login screen is working! Authentication will be connected next."
                );
            }
        });

        registerButton.addActionListener(e -> {
    showRegistrationScreen();
});
    
        panel.add(title);
        panel.add(subtitle);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BankingApp app = new BankingApp();
            app.setVisible(true);
        });
    }
private void showRegistrationScreen() {

    JFrame registerFrame = new JFrame("Customer Registration");

    registerFrame.setSize(500, 600);
    registerFrame.setLocationRelativeTo(this);

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(new Color(240, 244, 248));

    JLabel title = new JLabel("CUSTOMER REGISTRATION");
    title.setBounds(70, 30, 360, 40);
    title.setFont(new Font("Arial", Font.BOLD, 21));

    JLabel firstNameLabel = new JLabel("First Name");
    firstNameLabel.setBounds(60, 100, 150, 25);

    JTextField firstName = new JTextField();
    firstName.setBounds(200, 100, 230, 30);

    JLabel surnameLabel = new JLabel("Surname");
    surnameLabel.setBounds(60, 150, 150, 25);

    JTextField surname = new JTextField();
    surname.setBounds(200, 150, 230, 30);

    JLabel idLabel = new JLabel("National ID");
    idLabel.setBounds(60, 200, 150, 25);

    JTextField nationalId = new JTextField();
    nationalId.setBounds(200, 200, 230, 30);

    JLabel phoneLabel = new JLabel("Phone Number");
    phoneLabel.setBounds(60, 250, 150, 25);

    JTextField phone = new JTextField();
    phone.setBounds(200, 250, 230, 30);

    JLabel addressLabel = new JLabel("Address");
addressLabel.setBounds(60, 290, 150, 25);

JTextField address = new JTextField();
address.setBounds(200, 290, 230, 30);

    JLabel emailLabel = new JLabel("Email Address");
    emailLabel.setBounds(60, 300, 150, 25);

    JTextField email = new JTextField();
    email.setBounds(200, 300, 230, 30);

    JLabel typeLabel = new JLabel("Customer Type");
    typeLabel.setBounds(60, 350, 150, 25);

    String[] types = {"Individual", "Corporate"};

    JComboBox<String> customerType = new JComboBox<>(types);
    customerType.setBounds(200, 350, 230, 30);

    JButton submitButton = new JButton("REGISTER");
    submitButton.setBounds(100, 430, 300, 40);

    JButton backButton = new JButton("BACK");
    backButton.setBounds(100, 480, 300, 35);

    submitButton.addActionListener(e -> {

        if (firstName.getText().trim().isEmpty()
                || surname.getText().trim().isEmpty()
                || nationalId.getText().trim().isEmpty()
                || phone.getText().trim().isEmpty()
                || email.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(
                registerFrame,
                "Please complete all fields."
            );

        } else {

            JOptionPane.showMessageDialog(
                registerFrame,
                "Registration form completed successfully!"
            );
        }
    });

    backButton.addActionListener(e -> registerFrame.dispose());

    panel.add(title);
    panel.add(firstNameLabel);
    panel.add(firstName);
    panel.add(surnameLabel);
    panel.add(surname);
    panel.add(idLabel);
    panel.add(nationalId);
    panel.add(phoneLabel);
    panel.add(phone);
    panel.add(addressLabel);
    panel.add(address);
    panel.add(emailLabel);
    panel.add(email);
    panel.add(typeLabel);
    panel.add(customerType);
    panel.add(submitButton);
    panel.add(backButton);

    registerFrame.add(panel);
    registerFrame.setVisible(true);
}

    public BankingSystem getBankingSystem() {
        return bankingSystem;
    }

}
