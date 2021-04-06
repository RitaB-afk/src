import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JAction extends JFrame implements ActionListener{

    JLabel label= new JLabel("Name?");
    JTextField field= new JTextField(12);
    JButton button= new JButton ("OK");

    public JAction()
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
        label.setText("Thank you so much!");
        button.setText("Application done!");
    }
    public static void main(String[] args)
    {
        JAction aFrame= new JAction();
        final int Width= 250;
        final int Height= 150;
        aFrame.setSize(Width,Height);
        aFrame.setVisible(true);
    }
}
