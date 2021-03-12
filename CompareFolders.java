import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class CompareFolders {
    private static final String New_Line= System.lineSeparator();

    public static void main (String[] args) throws IOException {

        Path path1= Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\Objectoriented programming 2\\test1.docx");
        Path path2= Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\Objectoriented programming 2\\test2.txt");
        Path path3= Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\test3.java");
        String content = "...";
        Files.write(path1, content.getBytes(StandardCharsets.UTF_8));
        Files.write(path2, content.getBytes(StandardCharsets.UTF_8));
        Files.write(path3, content.getBytes(StandardCharsets.UTF_8));

        if (path1.getParent().equals(path3.getParent()) && path2.getParent().equals(path3.getParent()) )
        {
            System.out.println("File 1 and file 2 are in the same folder as file 3.");
        }
        else
        {
            System.out.println("File 3 is not in the same folder");
        }
    }
}
