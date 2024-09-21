import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JOptionPane Kullanımı Pencere Oluşturma");

        JOptionPane.showMessageDialog(jFrame,"Hasan");
        JOptionPane.showMessageDialog(jFrame,"Are you ready","Lets Start",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(jFrame,"Are you ready","Lets Start",JOptionPane.OK_CANCEL_OPTION);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}