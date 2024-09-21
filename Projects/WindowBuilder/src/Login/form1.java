package Login;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.AWTEventMulticaster.add;

public class form1 extends JFrame {
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton loginButton;
    private JPanel panel1;
    private JTabbedPane loginTabbedPane;
    private JPanel loginPanel;
    private JPanel signupPanel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel usernameLblinTabLogin;

    public form1(){
    
        add(panel1);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("İlk Window Builder");
        setContentPane(panel1);
        usernameLabel.setText(Labels.LABEL_USERNAME);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(usernameTextField.getText() + " " + passwordTextField.getText());
            }
        });
    }

}
