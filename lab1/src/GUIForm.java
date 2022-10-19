import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class GUIForm extends JFrame {
    private JPanel JPanel1;
    private JTextField textField1;
    private JButton okButton;
    private JButton closeButton;
    private JLabel labelDate;

    public static void main(String[] args) {
        GUIForm Example1 = new GUIForm();
        Example1.setVisible(true);//wyświetlenie ramki
    }

    public GUIForm(){
        super("Moja pierwsza aplikacja");
        this.setContentPane(this.JPanel1); //wyświetlenie okienka na ekranie !!
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//zamykanie okienka
        this.setSize(400,300);//ustawienie rozdzielczości
        this.pack();// rozmiar dostosowany do umieszczonych komponentów
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,new Date());
                labelDate.setText(new Date().toString());
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
