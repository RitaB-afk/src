import javax.swing.*;
import java.awt.*;

public class JComboBoxdemo extends JFrame{
    String [] ColorChoice= {"Blue", "Yellow", "Red","White", "Black"};
    JComboBox ChooseColor= new JComboBox(ColorChoice);


    JLabel BoxLabel= new JLabel("Choose or enter your favorite color");

    public JComboBoxdemo()
    {
        super("JComboBox Demo");
        ChooseColor.setEditable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        BoxLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        add(BoxLabel);
        add(ChooseColor);
        

    }
    public static void main(String[] args){
        final int WIDTH= 350;
        final int HEIGHT= 120;
        JComboBoxdemo frame= new JComboBoxdemo();
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);

    }

}
