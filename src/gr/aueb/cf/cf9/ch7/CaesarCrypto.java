package gr.aueb.cf.cf9.ch7;

/**
 * The program has 2 methods of encryption and
 * decryption with the Julius Caesar algorithm.
 * 2 more methods are used to wrap around the ciphering.
 * The main checks if the methods are written correctly.
 */
public class CaesarCrypto {

    public static void main(String[] args) {
        String s = "ABC XYZ";
        int key = 3;
        String encrypted = encode(s, key);
        System.out.println(encrypted);
        System.out.println(decode(encrypted, key));

    }

    public static String encode(String s, int key) {
        StringBuilder sb = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (!Character.isLetter(ch)) {
                sb.append(ch);
            } else {
                sb.append(cipher(ch, key));
            }
        }

        return sb.toString();
    }

    public static String decode(String s, int key) {
        StringBuilder sb = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch != ' ') {
                sb.append(decipher(ch, key));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static char cipher(char ch, int key) {
        int newCh;
        int base = Character.isUpperCase(ch) ? 'A' : 'a';
        newCh = (ch + key) % 26;
        return (char) (newCh + base);
    }

    public static char decipher(int ch, int key) {
        int newCh;
        int base = Character.isUpperCase(ch) ? 'A' : 'a';

        newCh = ((ch - key) + 26) % 26;
        return (char) (newCh + base);
    }
}