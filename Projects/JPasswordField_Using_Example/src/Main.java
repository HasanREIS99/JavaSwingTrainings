import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = createJframe("JPasswordField Using Example");

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(30,50,100,25);

        JLabel jLabel = new JLabel("Password : ");
        jLabel.setBounds(30,20,200,25);

        JButton jButton = new JButton("Show the Password");
        jButton.setBounds(30,80,200,25);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = new String(jPasswordField.getPassword());
                jLabel.setText(jLabel.getText()+text);
            }
        });

        jFrame.add(jPasswordField);
        jFrame.add(jButton);
        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }

    public static JFrame createJframe(String title){
        JFrame jFrame = new JFrame(title);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        return jFrame;
    }
}