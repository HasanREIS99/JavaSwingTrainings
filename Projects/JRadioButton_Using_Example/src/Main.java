import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("RadioButton Using Example");



        JRadioButton jRadioButton = new JRadioButton("Man");
        jRadioButton.setBounds(30,50,150,25);
        jRadioButton.setActionCommand("M");

        JRadioButton jRadioButton2 = new JRadioButton("Woman");
        jRadioButton2.setBounds(30,80,150,25);
        jRadioButton2.setActionCommand("W");

        JRadioButton jRadioButton3 = new JRadioButton("I dont want select");
        jRadioButton3.setBounds(30,110,150,25);
        jRadioButton3.setActionCommand("D");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);

        JButton jButton = new JButton("Send");
        jButton.setBounds(30,150,100,25);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!jRadioButton.isSelected() && !jRadioButton2.isSelected() && !jRadioButton3.isSelected()){
                    //System.out.println("You have to select this one!!!");
                    JOptionPane.showMessageDialog(jFrame, "You have to select one option!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else System.out.println(buttonGroup.getSelection().getActionCommand());
            }
        });





        jFrame.add(jRadioButton);
        jFrame.add(jRadioButton2);
        jFrame.add(jRadioButton3);
        jFrame.add(jButton);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }
}