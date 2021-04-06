import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAction2 extends JFrame implements ActionListener{

    JLabel label= new JLabel("Name?");
    JTextField field= new JTextField(12);
    JButton button= new JButton ("OK");

    public JAction2()
    {
        super("Action");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);
        button.addActionListener(this);
        field.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       Object source= e.getSource();
       if(source==button)
           label.setText("You clicked the button");
       else label.setText("You pressed Enter");
    }
    public static void main(String[] args)
    {
        JAction2 aFrame= new JAction2();
        final int Width= 250;
        final int Height= 150;
        aFrame.setSize(Width,Height);
        aFrame.setVisible(true);
    }
}
