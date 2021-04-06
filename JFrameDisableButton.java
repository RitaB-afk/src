import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton  extends JFrame implements ActionListener {
    final int WIDTH= 250;
    final int HEIGHT= 350;
    JButton press= new JButton("Press me");

    public JFrameDisableButton () {
        super ("Disabled Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(WIDTH,HEIGHT);
        add(press);
        press.addActionListener(this);
    }
    public static void main(String[] args) {
        JFrameDisableButton ex= new JFrameDisableButton();
        ex.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        press.setEnabled(false);
    }
}
