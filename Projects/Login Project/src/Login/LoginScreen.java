package Login;

import javax.swing.*;

public class LoginScreen extends JFrame {

    private JTabbedPane loginTabbedPane;
    private JPanel loginPanel;
    private JPanel signUpPanel;
    private JLabel usernameLblLogin;
    private JTextField usernameTextField;
    private JPasswordField passwordField1;

    public LoginScreen(){
//        loginTabbedPane.add(loginPanel);
//        loginTabbedPane.add(signUpPanel);
        add(loginTabbedPane);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login Screen");
    }
}
