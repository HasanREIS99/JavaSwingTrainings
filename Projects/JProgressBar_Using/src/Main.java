import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JProgressBar Kullanımı");
        JProgressBar jProgressBar = new JProgressBar(0, 2000);
        jProgressBar.setValue(0);
        jProgressBar.setStringPainted(true);
        jProgressBar.setBounds(100, 100, 200, 25);
        jFrame.add(jProgressBar);

        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 2000; i += 20) {
                    Thread.sleep(100);
                    publish(i);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                for (Integer value : chunks) {
                    jProgressBar.setValue(value);
                }
            }

            @Override
            protected void done() {
                JOptionPane.showMessageDialog(jFrame, "Bitti", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
            }
        };

        worker.execute();
    }
}
