import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     System.out.print("hasab");
        JFrame jFrame = new JFrame();
        jFrame.setSize(200,200);

        JButton jButton = new JButton("Button");
      //  jFrame.getContentPane().add(jButton);

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.add(jButton);


      
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}