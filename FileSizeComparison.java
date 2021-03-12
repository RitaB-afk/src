import java.nio.file.*;
import java.nio.file.Paths;

public class FileSizeComparison {
    public static void main (String[] args) {
        Path filepath = Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\angels.txt");
        Path filepath1 = Paths.get("C:\\Users\\Rita.DESKTOP-NDQVPRR\\OneDrive\\Bureau\\angels.docx");
        System.out.println(" The size of the notepad file is: " + filepath.toString().length());
        System.out.println(" The size of the doc file is: " + filepath1.toString().length());
        int ratio= (filepath.toString().length())/filepath1.toString().length();
        System.out.println(" The ratio is: " + ratio);
    }
}
