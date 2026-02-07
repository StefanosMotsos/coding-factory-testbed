package gr.aueb.cf.cf9.ch18Challenges;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

    }
    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] frequency = new int[128];
        for (char item : s1.toCharArray()) {
            frequency[item]++;
        }
        for (char item : s2.toCharArray()) {
            frequency[item]--;
            if (frequency[item] < 0) return false;
        }
        return true;
    }
}
