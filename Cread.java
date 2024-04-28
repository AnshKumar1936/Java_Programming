import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cread {
    public static void main(String[] args) {
        
        String inputFilePath = "character.txt";
        
        String outputFilePath = "Output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            int c;
            while ((c = reader.read()) != -1) {
                
                if (Character.isLetter(c)) {
                    
                    writer.write(c);
                }
            }

            System.out.println("Character values have been extracted and stored in output.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

