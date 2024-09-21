import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JComboBox Using Example");

        String[] array = new String[]{
                "C",
                "C#",
                "C++",
                "Java",
                "Python"
        };


        JComboBox jComboBox = new JComboBox(array);
        jComboBox.setBounds(30,50,100,30);

        JButton jButton = new JButton("Show");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jComboBox.getSelectedItem());
            }
        });
        jButton.setBounds(30,100,100,30);



        jFrame.add(jComboBox);
        jFrame.add(jButton);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}