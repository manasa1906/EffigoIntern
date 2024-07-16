package Files;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Read  {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Users\\Manasa\\Documents\\first.txt");

        try (BufferedReader reader = Files.newBufferedReader(file)) {
          
            String line;
            System.out.println("File Contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}