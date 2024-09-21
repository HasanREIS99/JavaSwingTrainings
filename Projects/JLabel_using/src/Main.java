import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Label Kullanım Örneği");

        JLabel jLabel = new JLabel("LABEL.COM");

        jLabel.setBounds(100,50,150,150);
        jFrame.add(jLabel);

        int no = 4;

        JButton jButton = new JButton("Gönder");
        jButton.setBounds(100,150,100,50 );
        jButton.addActionListener(new ActionListener() {
            int count =1;
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Tıklandı ! "+count++);
            }
        });

        jFrame.add(jButton);




        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}