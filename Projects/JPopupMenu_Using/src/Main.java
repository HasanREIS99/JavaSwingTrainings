import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Popup Örneği");

        JPopupMenu jPopupMenu = new JPopupMenu("Popup Menu");
        JMenuItem jMenuItem = new JMenuItem("Cut");
        JMenuItem jMenuItem1 = new JMenuItem("Copy");
        JMenuItem jMenuItem2 = new JMenuItem("Paste");

        jPopupMenu.add(jMenuItem);
        jPopupMenu.add(jMenuItem1);
        jPopupMenu.add(jMenuItem2);

        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) { // Sağ tıklama kontrolü
                    jPopupMenu.show(jFrame, e.getX(), e.getY());
                }
            }
        });

        jFrame.add(jPopupMenu);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}