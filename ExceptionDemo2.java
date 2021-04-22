import javax.swing.*;
import java.awt.*;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int numerator= 0, denominator = 0, result = 0;
        String inputString;
        try {
            inputString= JOptionPane.showInputDialog(null, "Enter a number to be divided");
            numerator= Integer.parseInt(inputString);
            inputString= JOptionPane.showInputDialog(null, "Enter a number to be divided by");
            denominator= Integer.parseInt(inputString);
            result= numerator/denominator;

        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
            result=0;
        }
        catch (NumberFormatException nfe){
            nfe.printStackTrace();
            JOptionPane.showMessageDialog(null,"This application accepts digits only! ");
            numerator= 1;
            denominator=1;
            result=1;
        }
        JOptionPane.showMessageDialog(null,"The result of the division is: " +result);


    }
}
