import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComboBoxdemo extends JFrame implements ItemListener {
    String [] ColorChoice= {"Blue", "Yellow", "Red","White", "Black"};
    JComboBox ChooseColor= new JComboBox(ColorChoice);


    JLabel BoxLabel= new JLabel("Choose or enter your favorite color");
    JButton Enter= new JButton("Enter");

    public JComboBoxdemo()
    {
        super("JComboBox Demo");
        ChooseColor.setEditable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        BoxLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        add(BoxLabel);
        add(ChooseColor);
        add(Enter);
        ChooseColor.addItemListener(this);


    }
    public static void main(String[] args){
        final int WIDTH= 350;
        final int HEIGHT= 120;
        JComboBoxdemo frame= new JComboBoxdemo();
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
     String chosen= (String) ChooseColor.getSelectedItem();
     JOptionPane.showMessageDialog(null,chosen);
    }
}
