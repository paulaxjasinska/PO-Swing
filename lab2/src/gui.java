import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame {
    private JPanel panel1;
    private JPanel UsernamexPassword;
    private JTextField textField1;
    private JTextField passwordField2;
    private JButton loginButton;
    private JLabel koniec;
    private JPasswordField passwordField1;

    public static void main(String[] args) {
        gui lab2 = new gui();
        lab2.setVisible(true);
    }

    public gui(){
        super("Nazwa użytkownika i hasło");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                koniec.setText("Username: "+ textField1.getText()+ ", \t Password: " + new String(passwordField1.getPassword()));
            }
        });
    }
}
