import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("LAYOUT");

        JButton jButton = new JButton("b1");
        JButton jButton1 = new JButton("b2");
        JButton jButton2 = new JButton("b3");
        JButton jButton3 = new JButton("b4");
        JButton jButton4 = new JButton("b5");

        // Birinci JPanel - CENTER konumuna yerleştiriliyor
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel.add(jButton);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);

        // İkinci JPanel - LEADING konumuna yerleştiriliyor
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout(FlowLayout.LEADING));
        jPanel2.add(jButton);
        jPanel2.add(jButton1);
        jPanel2.add(jButton2);
        jPanel2.add(jButton3);
        jPanel2.add(jButton4);

        // Birinci JPanel - CENTER konumuna
        jFrame.add(jPanel, BorderLayout.CENTER);

        // İkinci JPanel - LEADING konumuna
        jFrame.add(jPanel2, BorderLayout.EAST);

        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
