import java.io.File;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

public class FileStatistics {
    public static void main(String[] args) {
        Path filepath=Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\Objectoriented programming 2\\testobj.docx");
        File file = new File(filepath.toString());
        int count= filepath.getNameCount();
        System.out.println("Path is " + filepath.toString());
        System.out.println("Filename is " + filepath.getFileName());
        System.out.println("The containing folder is " + filepath.getParent());
        System.out.println("The length of the file is " + filepath.toString().length() + "Bytes.");
        System.out.println("The last modified time is originally is written like this " + (file.lastModified()));
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        System.out.println("After Formatting the date : " + sdf.format(file.lastModified()));
    }
}
