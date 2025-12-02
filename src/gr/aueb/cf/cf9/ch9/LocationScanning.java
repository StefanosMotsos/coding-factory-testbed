package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * The program takes the Locations.txt file and
 * creates a new file called Locations-formatted.txt.
 */
public class LocationScanning {
    public static void main(String[] args) {
        String inFilePath = "C:/Users/stefa/Downloads/locations.txt";
        String outFilePath = "C:/Users/stefa/Downloads/locations-formatted.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            String line;
            String[] tokens;

            //skip 1st line
            String header = reader.readLine();

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
                if (tokens.length >= 3) {
                    printFormatted(ps, tokens);
                    printFormatted(System.out, tokens);
                } else {
                    System.err.println("Invalid line format: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Locations\": \"%s\", \"Latitude\": \"%s\", \"Longitude\": \"%s\" },\n", tokens[0].trim(), tokens[1].trim(), tokens[2].trim());
    }
}


