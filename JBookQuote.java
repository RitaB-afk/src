import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote extends JFrame implements ActionListener {
    final int WIDTH= 225;
    final int HEIGHT=350;
    JLabel Titlein= new JLabel("Book Quote");
    JLabel quote= new JLabel("A book can open the mind, free the heart and speak to the soul.");
    Font bigFont= new Font("Arial", Font.BOLD,16);
    Font smallFont= new Font("Serif", Font.ITALIC, 13);
    JButton press= new JButton("Display Title");
    JLabel name= new JLabel("");

    public JBookQuote() {
        super("Book Quote Exercise");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        Titlein.setFont(bigFont);
        quote.setFont(smallFont);
        add(Titlein);
        add(quote);
        add(press);
        add(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        press.addActionListener(this);
    }
    public static void main (String[] args)
    {
        JBookQuote ex= new JBookQuote();
        ex.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String book= "The great";
       name.setText(book);
    }
}
