package gr.aueb.cf.cf9.ch7;

/**
 * The program has 2 methods of encryption and
 * decryption with the Julius Caesar algorithm.
 * The main checks if the methods are written correctly.
 */
public class OGCaesar {
    static String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    static String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        String s = "ABC XYZ";
        int key = 3;
        String encrypted = encode(s, key);
        System.out.println(encrypted);
        System.out.println(decode(encrypted, key));

    }

    /**
     * The method encodes a message with the Caesar algorithm.
     * @param s     The message.
     * @param key   The encryption key.
     * @return      The encrypted message.
     */
    public static String encode(String s, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                if (Character.isUpperCase(ch)) {
                    int index = upperAlphabet.indexOf(ch);
                    int keyIndex = (index + key) % upperAlphabet.length();
                    sb.append(upperAlphabet.charAt(keyIndex));
                }
                if (Character.isLowerCase(ch)) {
                    int index = lowerAlphabet.indexOf(ch);
                    int keyIndex = (index + key) % lowerAlphabet.length();
                    sb.append(lowerAlphabet.charAt(keyIndex));
                }
            } else sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * The method decodes a message with the Caesar algorithm.
     * @param s     The message.
     * @param key   The encryption key.
     * @return      The decrypted message.
     */
    public static String decode(String s, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                if (Character.isUpperCase(ch)) {
                    int index = upperAlphabet.indexOf(ch);
                    int keyIndex = ((index - key) + 26)% upperAlphabet.length();
                    sb.append(upperAlphabet.charAt(keyIndex));
                }
                if (Character.isLowerCase(ch)) {
                    int index = lowerAlphabet.indexOf(ch);
                    int keyIndex = ((index - key) + 26) % lowerAlphabet.length();
                    sb.append(lowerAlphabet.charAt(keyIndex));
                }
            } else sb.append(ch);
        }
        return sb.toString();
    }

}