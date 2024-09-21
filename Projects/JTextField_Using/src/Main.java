import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JText Field using example");

        JLabel firstNumber;
        JLabel secondNumber;
        JLabel result;
        JTextField firstNumberTextField;
        JTextField secondNumberTextField;
        JTextField resultTextField;
        JButton calculate;

        firstNumber = new JLabel("First Number : ");
        firstNumber.setBounds(50,0,150,30);

        secondNumber = new JLabel("Second Number : ");
        secondNumber.setBounds(50,50,150,30);

        result = new JLabel("Result : ");
        result.setBounds(50,100,150,30);

        firstNumberTextField = new JTextField();
        firstNumberTextField.setBounds(50,30,100,30);

        secondNumberTextField = new JTextField();
        secondNumberTextField.setBounds(50,80,100,30);

        resultTextField = new JTextField();
        resultTextField.setBounds(50,130,100,30);

        resultTextField.setEditable(false);


        calculate = new JButton("Sum");
        calculate.setBounds(50,180,100,30);
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int firstNo = Integer.parseInt(firstNumberTextField.getText());
                int secondNo = Integer.parseInt(secondNumberTextField.getText());
                int result = firstNo + secondNo;
                resultTextField.setText(String.valueOf(result));
            }
        });





        jFrame.add(firstNumberTextField);
        jFrame.add(secondNumberTextField);
        jFrame.add(resultTextField);
        jFrame.add(firstNumber);
        jFrame.add(secondNumber);
        jFrame.add(result);
        jFrame.add(calculate);

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }
}