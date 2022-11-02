import javax.swing.*;

public class GUI extends JFrame {
    private JPanel panel1;
    private JPanel JPanel1;
    private JPanel JPanel2;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JButton okButton;

    public static void main(String[] args) {
      GUI first = new GUI();
      first.setVisible(true);
    }


    public GUI(){
        super("Systemy operacyjne");
        this.setContentPane(JPanel1);
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
