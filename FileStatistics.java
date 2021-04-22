import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileStatistics {
    public static void main(String[] args) {
    Path file= Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\Objectoriented programming 2\\what.docx");
    int count= file.getNameCount();

    try {
        BasicFileAttributes attr= Files.readAttributes(file, BasicFileAttributes.class);

        System.out.println("The file name is " + file.getFileName());
        System.out.println("There are " + count + " elements in the path");
       System.out.println("The containing folder is " + file.getName(count-2));
        System.out.println("Creation time is: " + attr.creationTime());
        System.out.println("Size is " + attr.size());
        System.out.println("Last modified time is "+ attr.lastModifiedTime());
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
