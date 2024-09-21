import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        System.out.println("hasna");

        JFrame jFrame = new JFrame("Button Using");


        JButton jButton = new JButton();
        jButton.setText("Send Request");
        jButton.setBounds(0,0,100,200);

        jButton.setBackground(Color.blue);
        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Buttona basıldı");
            }
        });

        
        jFrame.setLayout(null);
        jFrame.setSize(200,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}