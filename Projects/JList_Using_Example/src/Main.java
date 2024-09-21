import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JList Using Example");

        JLabel jLabel = new JLabel("şşş");
        jLabel.setBounds(50,0,100,25);

        JLabel jLabel1 = new JLabel("şşş");
        jLabel1.setBounds(50,30,100,25);

        DefaultListModel<String> defaultListModel = new DefaultListModel<>();
        defaultListModel.addElement("Java");
        defaultListModel.addElement("C");
        defaultListModel.addElement("C++");
        defaultListModel.addElement("C#");
        defaultListModel.addElement("Python");

        JList<String> list = new JList<>(defaultListModel);
        list.setSize(400,400);
        list.setBounds(50,50,100,100);

        DefaultListModel<String> defaultListModel1 = new DefaultListModel<>();
        defaultListModel1.addElement("Swing");
        defaultListModel1.addElement("Spring");
        defaultListModel1.addElement(".Net");
        defaultListModel1.addElement("ASP.NET CORE MVC");

        JList<String> list1 = new JList<>(defaultListModel1);
        list1.setBounds(50,200,100,100);

        JButton jButton = new JButton("Show");
        jButton.setBounds(200,150,100,25);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list1.getSelectedIndex() != -1 && list.getSelectedIndex() != -1 ){
                    jLabel.setText("List : "+list.getSelectedValue());
                    jLabel1.setText("List1 : "+list1.getSelectedValue());
                }else {
                    System.out.println("Seçim yapınız");
                }

            }
        });


        jFrame.add(list);
        jFrame.add(list1);
        jFrame.add(jButton);
        jFrame.add(jLabel);
        jFrame.add(jLabel1);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}