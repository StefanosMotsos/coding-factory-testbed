package gr.aueb.cf.cf9.review;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;


public class CollectionOfSix {
    static Path outputFile = Paths.get("C:/Users/stefa/Downloads/output.txt");
    public static void main(String[] args) {
        Path path = Paths.get(("C:/Users/stefa/Downloads/ProjectOne.txt"));
        int[] numbers = new int[49];

        try {
            numbers = getNumbers(path);
        } catch (IOException e) {
            System.out.println("There is not file!");
        }

        Arrays.sort(numbers);

        final int KEY = 6;
        int[] tuples = new int[KEY];
        getTupleOfSix(numbers,KEY, 0, tuples, 0);
    }

    public static int[] getNumbers(Path path) throws IOException {
        String lines;
        String[] tokens;

        lines = Files.readString((path), StandardCharsets.UTF_8);
        tokens = lines.split(",");
        int[] numbers = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i].trim());
        }
        return numbers;
    }

    public static void getTupleOfSix(int[] numbers, int key, int start, int[]tuples, int index) {
        if (index == key) {
            if (checkFilters(tuples)) {
                try {
                    textWriter(outputFile, tuples);
                } catch (IOException e) {
                    System.out.println("output file doesn't exist!");
                }
            }
            return;
        }

        for (int i = start; i <= numbers.length - (key - index); i++) {
            tuples[index] = numbers[i];
            getTupleOfSix(numbers, key, i + 1, tuples, index + 1);
        }
    }

    public static boolean isEven(int[] tuples) {
        int count = 0;
        for (int num : tuples) {
            if (num % 2 == 0) count++;
        }
        if (count <= 4) return true;
        else return false;
    }

    public static boolean isOdd(int[] tuples) {
        int count = 0;
        for (int num : tuples) {
            if (num % 2 != 0) count++;
        }
        if (count <= 4) return true;
        else return false;
    }

    public static boolean isContiguous(int[] tuples) {
        int count = 1;
        for (int i = 1; i < tuples.length; i++) {
            if (tuples[i] == tuples[i-1] + 1) {
                count++;
                if (count > 2) return false;
            } else {
                count = 1;
            }
        }
        return true;
    }

    public static boolean isSameEndings(int[] tuples) {
        int[] endings = new int[10];
        for (int el : tuples) {
            if (++endings[el%10] <= 3) return true;
        }
        return false;
    }

    public static boolean isSameTen(int[] tuples) {
        int[] decimals = new int[5];
        for (int el : tuples) {
            if (++decimals[(el - 1) / 10] <= 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkFilters(int[] tuples) {
        return isEven(tuples) &&
                isOdd(tuples) &&
                isContiguous(tuples) &&
                isSameEndings(tuples) &&
                isSameTen(tuples);
    }

    public static void textWriter(Path path, int[] tuples) throws IOException {
        Files.createDirectories(path.getParent());
        String line = Arrays.toString(tuples)
                +"\n";
        Files.writeString(
                path,
                line,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }
}
