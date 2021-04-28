import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.nio.file.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class WriteCustomerList {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Path file= Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\Objectoriented programming 2\\trep.txt");
        String s = "000,        ,        ,0000.00"+System.getProperty("line.separator");
        final int RECSIZE = s.length();
        FileChannel fc= null;
        String delimiter = ",";
        String idString;
        int id;
        String firstname;
        String Lastname;
        double balance;
        final String QUIT= "999";

        try {
            fc= (FileChannel)Files.newByteChannel(file, READ, WRITE);
            System.out.print("Enter customer ID>>");
            idString= input.nextLine();
            while(!(idString.equals(QUIT))){
                id=Integer.parseInt(idString);
                System.out.print("Enter first name of the customer with ID #" + id);
                firstname=input.nextLine();
                System.out.print("Enter last name of customer with ID #" + id);
                Lastname= input.nextLine();
                System.out.print("Enter customer's balance");
                balance= input.nextDouble();
                input.nextLine();
                DecimalFormat df= new DecimalFormat("0000.00");
                s=idString +delimiter + firstname + delimiter + Lastname + delimiter+ df.format(balance) + System.getProperty("line.separator");
                byte[] data= s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);
                fc.position(id * RECSIZE);
                fc.write(buffer);
                System.out.print("Enter next customer's ID or QUIT with 999");
                idString= input.nextLine();

            }

        fc.close();
        }
        catch (Exception e) {
            System.out.println("error message: "+ e);
        }

    }
}
