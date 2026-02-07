package gr.aueb.cf.cf9.ch17;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class TextFileSorted {
    public static void main(String[] args) {
        try {
            Path path = Path.of("C:/Users/stefa/Downloads/ch17test.txt");
            List<Character> characters = readFile(path);
            Map<Character, Long> frequencies = calculateFrequencies(characters);
            Map<Character, Double> percentages = calculatePercentages(frequencies, characters.size());
            printSortedCharacters(percentages);
            System.out.println();
            printSortedPercentages(percentages);
        } catch (Exception e) {
            System.err.println("Error while handling the file. " + e.getMessage());
        }

    }

    public static List<Character> readFile (Path path) throws IOException {
        try {
            String text = Files.readString(path, StandardCharsets.UTF_8);
            List<Character> characters = new LinkedList<>();
            for (char ch : text.toCharArray()) {
                characters.add(ch);
            }
            return characters;
        } catch (IOException e) {
            System.err.println("Error while reading file!" + e.getMessage());
            throw e;
        }
    }

    public static Map<Character, Long> calculateFrequencies(List<Character> characters) {
        return characters.stream()
                .collect(Collectors.groupingBy(
                        c -> c, Collectors.counting()
                ));
    }

    public static Map<Character, Double> calculatePercentages(Map<Character, Long> frequencies,
                                                              int totalCharacters) {
        return frequencies.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> (entry.getValue() * 100.0) / totalCharacters
                ));
    }

    public static void printSortedCharacters (Map<Character, Double> percentages) {
        List<Map.Entry<Character, Double>> list =  new ArrayList<>(percentages.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getKey));
        list.forEach(entry ->
                System.out.printf("%c: %.2f%%\n", entry.getKey(), entry.getValue()));
    }

    public static void printSortedPercentages (Map<Character, Double> percentages) {
        List<Map.Entry<Character, Double>> list =  new ArrayList<>(percentages.entrySet());
        list.sort(Comparator.comparing(
                        (Map.Entry<Character, Double> e) -> e.getValue()).reversed()
        );
        list.forEach(entry ->
                System.out.printf("%c: %.2f%%\n", entry.getKey(), entry.getValue()));
    }
}