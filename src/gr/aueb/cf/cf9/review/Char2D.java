package gr.aueb.cf.cf9.review;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Char2D {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/stefa/Downloads/ProjectThree.txt");

        int[][] fileArr = null;
        try {
            fileArr = passFileToArray(path);
        } catch (IOException e) {
            System.out.println("File doesn't exist!");
        }

        if (fileArr != null) {
            Arrays.sort(fileArr, (a, b) -> a[0] - b[0]);
        }
        System.out.println("Sorted by character: ");
        printArray(fileArr);

        Arrays.sort((fileArr), (a, b) -> b[1] - a[1]);
        System.out.println("Sorted by frequency: ");
        printArray(fileArr);
    }

    public static int[][] passFileToArray(Path path) throws IOException {
        int[][] charCounter = new int[128][2];
        try {
            String lines = Files.readString(path, StandardCharsets.UTF_8);
            for (char ch : lines.toCharArray()) {
                if (Character.isWhitespace(ch) || ch == ',') continue;
                else {
                    for (int i = 0; i < charCounter.length; i++) {
                        if (charCounter[i][0] == 0) {
                            charCounter[i][0] = ch;
                            charCounter[i][1]++;
                            break;
                        } else if (ch == charCounter[i][0]) {
                            charCounter[i][1]++;
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return charCounter;
    }

    public static void printArray(int[][] fileArr) {
        for (int[]el : fileArr) {
            if (el[1] > 0) {
                System.out.println((char) el[0] + ":" + el[1]);
            }
        }
    }
}
