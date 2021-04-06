import javax.swing.*;
public class JFramedemo {
    public static void main(String[] args) {
        JFrame aFrame= new JFrame("This is a frame");
        final int Width= 300;
        final int Height= 250;
        aFrame.setSize(Width, Height);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
