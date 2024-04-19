import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cread {
    public static void main(String[] args) {
        // Input file path
        String inputFilePath = "character.txt";
        // Output file path
        String outputFilePath = "characterOut.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            int c;
            while ((c = reader.read()) != -1) {
                // Check if the character is alphabetic
                if (Character.isLetter(c)) {
                    // Write the character to the output file
                    writer.write(c);
                }
            }

            System.out.println("Character values have been extracted and stored in output.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

