import java.util.Scanner;
public class TryToParseDouble {
    public static void main(String[] args) {
        double val;
        try {
            Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        String num= input.nextLine();
        val= Double.parseDouble(num);
        }
        catch(NumberFormatException e){
            val= 0;
            System.out.println("The number was not properly parsed.");
        }
        System.out.println("The number is "+ val);
    }
}
