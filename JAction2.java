import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JAction2 extends JFrame implements ActionListener{

    JLabel label= new JLabel("Hi");
    JTextField field= new JTextField(16);
    JButton button= new JButton("Click me");

    public JAction2 () {
        super("Frame with components");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);
        button.addActionListener(this);
        field.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source= e.getSource();
        if (source==button) {
            label.setText("You clicked the button!");
        }
        else {
            label.setText("You pressed enter");
        }
        
    }

    public static void main(String[] args){
        JFrame frame= new JAction2();
        final int WIDTH= 300;
        final int HEIGHT= 300;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
