package Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Write {
    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\Manasa\\Documents\\first.txt";

        // Content to be written
        List<String> content = Arrays.asList("Address", "Phone No");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            for (String line : content) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File has been written.");
}
 }
}