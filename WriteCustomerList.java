import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;

import java.nio.file.*;
import java.util.Scanner;

public class WriteCustomerList {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Path file= Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\Objectoriented programming 2\\obj.txt");
        String s = "000,        ,        ,0000.00"+ System.getProperty("line.separator");
        final int RECSIZE= s.length();
        FileChannel fc= null;
        String delimiter=",";
        String idString;
        int id;
        String firstname;
        String lastname;
        String balance;
        final String QUIT= "999";
        try {
            fc= (FileChannel)Files.newByteChannel(file, READ,WRITE);
            System.out.println("Enter customer ID or "+ QUIT + " to quit");
            idString= input.nextLine();
            while(!idString.equals(QUIT)) {
                id=Integer.parseInt(idString);
                System.out.println("Enter firstname for employee # " + id);
                firstname=input.nextLine();
                System.out.println("Enter lastname for employee #" + id);
                lastname=input.nextLine();
                System.out.println("Enter balance for employee #" + id);
                balance=input.nextLine();

                s= idString + delimiter + firstname +delimiter+ lastname+ delimiter+balance+ System.getProperty("line.separator");
                byte[] data=s.getBytes();
                ByteBuffer buffer=ByteBuffer.wrap(data);
                fc.position(id*RECSIZE);
                fc.write(buffer);

                System.out.println("Enter next customer ID number or" + QUIT +" to quit >>");
                idString= input.nextLine();
            }
            fc.close();

        } catch (Exception e) {
            System.out.println("error message: "+ e);
        }

    }
}
