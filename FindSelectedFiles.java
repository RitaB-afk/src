import java.io.*;
import java.nio.file.*;

public class FindSelectedFiles {

    public static void main(String[] args)
    {
        Path [] arr= {Path.of("C:\\Users\\Rita.DESKTOP-NDQVPRR\\IdeaProjects\\testintellij\\src\\autoexec.bat"),Path.of("C:\\Users\\Rita.DESKTOP-NDQVPRR\\IdeaProjects\\testintellij\\src\\CompareFolders.java"),
                Path.of("C:\\Users\\Rita.DESKTOP-NDQVPRR\\IdeaProjects\\testintellij\\src\\FileStatistics.class"),Path.of("C:\\Users\\Rita.DESKTOP-NDQVPRR\\IdeaProjects\\testintellij\\src\\Hello.doc")};

        InputStream input= null;
        for(int x=0; x<arr.length; x++) {
            try {

                input = Files.newInputStream(arr[x]);
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                String s = null;
                s = reader.readLine();
                System.out.println(arr[x]+" this document exists " + s);
                input.close();
            } catch (NoSuchFileException e) {
                System.out.println(arr[x]+" :No such file or directory");
            } catch (IOException e) {
                System.out.println("IO exception");

            }
        }


    }
}
