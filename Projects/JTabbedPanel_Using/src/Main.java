import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JTabbedPanel Using");

        JLabel jLabel = new JLabel("ilk alan");
        JLabel jLabel1 = new JLabel("İkinci Alan");
        JLabel jLabel2 = new JLabel("Üçüncü Alan");

        JPanel jPanel = new JPanel();
        jPanel.add(jLabel);

        JPanel jPanel1 = new JPanel();
        jPanel1.add(jLabel1);

        JPanel jPanel2 = new JPanel();
        jPanel2.add(jLabel2);

        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.setBounds(100,50,200,200);
        jTabbedPane.add("ilk",jPanel);
        jTabbedPane.add("İkinci",jPanel1);
        jTabbedPane.add("Üçüncü",jPanel2);


        jFrame.add(jTabbedPane);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}