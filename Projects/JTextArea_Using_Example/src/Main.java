import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JTextArea Using Example");

        JTextArea textArea;
        JLabel words;
        JLabel character;
        JButton calculate;

        words = new JLabel("Words : ");
        words.setBounds(50,30,100,30);

        character = new JLabel("Character : ");
        character.setBounds(150,30,100,30);

        textArea = new JTextArea();
        textArea.setBounds(50,80,200,200);

        calculate = new JButton("Calculate");
        calculate.setBounds(100,300,100,30);
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                int wordsCount = countWords(text);
                int charCharacter = text.length();
                words.setText("Words : "+wordsCount);
                character.setText("Character : "+charCharacter);
            }
        });


        jFrame.add(words);
        jFrame.add(character);
        jFrame.add(textArea);
        jFrame.add(calculate);


        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    public static int countWords(String text){
        if (text == null || text.isEmpty()) {
            return 0 ;
        }
        String [] words = text.split("\\s+");
        return words.length;
    }
}