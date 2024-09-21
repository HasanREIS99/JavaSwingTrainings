package Login;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginScreen loginScreen = new LoginScreen();
                loginScreen.setVisible(true);
            }
        });

    }
}