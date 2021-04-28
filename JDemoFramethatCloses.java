import javax.swing.*;
import java.awt.*;

public class JDemoFramethatCloses {
    public static void main(String[] args) {

        JFrame frame= new JFrame("My JFrame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final int WIDTH= 300;
        final int HEIGHT = 150;
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
        JLabel word= new JLabel("Hello");
        JLabel question= new JLabel("Player");
        Font tousebig= new Font("Century", Font.BOLD, 30);
        Font tousesmall= new Font ("Arial", Font.PLAIN, 16);
        frame.setLayout(new FlowLayout());
        word.setFont(tousebig);
        question.setFont(tousebig);
        frame.add(word);
        frame.add(question);
        JLabel nameprompt= new JLabel("Enter you Name: ");
        nameprompt.setFont(tousesmall);
        JTextField name = new JTextField(12);
        JButton button= new JButton("Enter");
        frame.add(nameprompt);
        frame.add(name);
        frame.add(button);

    }
}
