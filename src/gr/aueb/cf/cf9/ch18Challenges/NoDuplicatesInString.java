package gr.aueb.cf.cf9.ch18Challenges;

import java.util.LinkedHashSet;
import java.util.Set;

public class NoDuplicatesInString {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(noDuplicates(s));
    }

    public static String noDuplicates(String s) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        s.chars().forEach(ch -> set.add((char) ch));
        set.forEach(sb::append);
        return sb.toString();
    }
}
