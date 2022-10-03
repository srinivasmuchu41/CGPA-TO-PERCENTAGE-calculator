import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    private JButton calculateButton;
    private JTextField textCGPA;
    private JTextField textPERCENTAGE;
    private JPanel main;

    public calculator() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double cgpa;
               double Percentage;

               cgpa = Double.parseDouble(textCGPA.getText());

               Percentage=9.5*cgpa;
               textPERCENTAGE.setText(String.valueOf(Percentage)+"%");



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
