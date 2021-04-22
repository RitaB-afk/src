import java.nio.file.Path;
import java.nio.file.Paths;

public class FindSelectedFiles {

public static void main(String[] args) {

    Path file1= Paths.get("autoexec.bat");
    Path file2= Paths.get("CompareFolders.java");
    Path file3= Paths.get("FileStatistics.class");
    Path file4= Paths.get("Hello.doc");

    Path [] arr= {file1, file2, file3, file4};
    for (int x=0; x<arr.length; x++) {
        try {

            arr[x].getFileSystem().provider().checkAccess(arr[x]);
            System.out.println("the file " + arr[x].getFileName() + " do exist");


        } catch (Exception e) {
           System.out.println("the file "+ arr[x].getFileName() +" do not exist");
        }
    }

}
}