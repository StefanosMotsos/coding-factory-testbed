package gr.aueb.cf.cf9.ch18Challenges;

import java.util.Arrays;

public class FrequencyChar {
    public static void main(String[] args) {
        String s = "abracadabra";
        System.out.println();
    }

    public static char highestFrequency(String s) {
        int[] frequency = new int[128];

        s.chars().forEach(ch -> frequency[ch]++);
        int max = Arrays.stream(frequency).max().getAsInt();

        return (char) s.chars()
                .filter(ch -> frequency[ch] == max)
                .findFirst()
                .orElseThrow();
    }
}
