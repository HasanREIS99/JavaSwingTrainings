import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {



        JFrame jFrame = new JFrame("Zikirmatik");

        JLabel jLabel = new JLabel("100 kere söylendi: 0");
        jLabel.setBounds(145,100,500,100);

        jFrame.add(jLabel);

        JButton jButton = new JButton("0");
        jButton.setBounds(100,180,100,50);
        jButton.addActionListener(new ActionListener() {
            int countButton =0;
            int labelCount =0;
            @Override
            public void actionPerformed(ActionEvent e) {
                countButton++;

                if (countButton == 100){
                    countButton =0;
                    labelCount++;
                }

                jButton.setText(""+countButton);
                jLabel.setText("100 kere söylendi. "+labelCount);
                

            }
        });


        jFrame.add(jButton);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);




    }
}