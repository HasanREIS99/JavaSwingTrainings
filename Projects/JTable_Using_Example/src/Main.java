import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JTable Using Example");

        String[][] table = new String[][]{
                {"1","MAT","55"},
                {"2","FEN","80"},
                {"3","TUR","70"},
                {"4","SOS","25"}
        };
        String[] column = new String[]{
                "ID",
                "CLASS",
                "MARK"
        };

        JTable jTable = new JTable(table,column);
        jTable.setBounds(30,50,100,150);

        JScrollPane jScrollPane = new JScrollPane(jTable);

        //jFrame.add(jTable);
        jFrame.add(jScrollPane);


        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}