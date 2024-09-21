import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JMenü Kullanımı");


        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("MENÜ1");
        JMenu jMenu1 = new JMenu("Menü2");

        JMenuItem jMenuItem = new JMenuItem("M1");
        JMenuItem jMenuItem2 = new JMenuItem("M2");
        JMenuItem jMenuItem3 = new JMenuItem("M3");
        JMenuItem jMenuItem4 = new JMenuItem("M4");
        JMenuItem jMenuItem5 = new JMenuItem("A5");
        JMenuItem jMenuItem6 = new JMenuItem("A6");

        jMenu.add(jMenuItem);
        jMenu.add(jMenuItem2);
        jMenu.add(jMenuItem3);
        jMenu.add(jMenuItem4);

        jMenu1.add(jMenuItem5);
        jMenu1.add(jMenuItem6);

        jMenu.add(jMenu1);

        jMenuBar.add(jMenu);

        jFrame.setJMenuBar(jMenuBar);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
