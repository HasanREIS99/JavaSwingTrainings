import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JScrollBar Kullanımı");

        JLabel jLabel = new JLabel();
        jLabel.setBounds(50,50,200,30);

        JScrollBar jScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,10,10, 0,100);
        JScrollBar jScrollBarV = new JScrollBar(JScrollBar.VERTICAL,10,10, 0,100);

        jScrollBarV.setBounds(100,200,25,100);


        jScrollBar.setBounds(100,110,200,25);

        jScrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                jLabel.setText("nnn :9 "+jScrollBar.getValue());
            }
        });

        jFrame.add(jScrollBar);
        jFrame.add(jLabel);
        jFrame.add(jScrollBarV);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}