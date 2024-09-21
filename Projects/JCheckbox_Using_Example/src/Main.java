import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JCheckBox_Using_Example");

        JLabel jLabel = new JLabel();
        jLabel.setBounds(50,20,150,250);

        JCheckBox jCheckBox = new JCheckBox("Java");
        jCheckBox.setBounds(50,50,150,25);

        JCheckBox jCheckBox1 = new JCheckBox("C#");
        jCheckBox1.setBounds(50,90,150,25);

        jCheckBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                jLabel.setText(e.getStateChange() == 1 ? "C# seçildi" : "C# seçilmedi");
                if(jCheckBox1.isSelected()){
                    System.out.println("C# seçildi");
                }
            }
        });

        jCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                jLabel.setText(e.getStateChange() == 1 ? "Java seçildi" : "Java seçilmedi");
            }
        });




        jFrame.add(jCheckBox);
        jFrame.add(jCheckBox1);
        jFrame.add(jLabel);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}