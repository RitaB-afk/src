import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CompareFolders {
public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    System.out.println("Enter a filename");
    String name = input.nextLine();
    Path inputPath1= Paths.get(name);
    Path fullPath1= inputPath1.toAbsolutePath();
    Path file1 = Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\Objectoriented programming 2\\what.docx");
    Path file2 = Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\Objectoriented programming 2\\spreadsheet.xlsx");
    Path file3 = Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\Objectoriented programming 2\\obj.txt");

    int count1= fullPath1.getNameCount();
    int count2= file2.getNameCount();
    int count3= file3.getNameCount();

    Path con1= fullPath1.getName(count1-3);
    Path con2 = file2.getName(count2-2);
    Path con3 = file3.getName(count3-2);
   System.out.println("Full path for the file u entered is "+ fullPath1);
    System.out.println("The containing folder for " + fullPath1.getFileName()+ " is"+ con1);
    System.out.println("The containing folder for " + file2.getFileName()+ " is"+ con2);
    System.out.println("The containing folder for " + file3.getFileName()+ " is"+ con3);

    if(con1.equals(con2) && con2.equals(con3)) {
        System.out.println("The three files are all in the same folder");
    }
    else {
        System.out.println("The files are not in the same folder");
    }

}
}
