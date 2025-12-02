package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 * The program is 2 methods, one that encodes a string
 * while the other decodes it. The main method is used to
 * test the correctness of the encryption and decryption methods.
 */
public class CipherExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        String s;

        System.out.println("Please enter a sentence to encode:");
        s = sc.nextLine();
        while (s.isEmpty()) {
            System.out.println("Input cannot be empty. Please try again:");
            s = sc.nextLine();
        }

        System.out.println("Please enter the encryption key:");
        key = sc.nextInt();
        while (key < 0) {
            System.out.println("Please enter a positive encryption key!");
            key = sc.nextInt();
        }

        System.out.println("The encoded message is: ");
        String encrypted = encode(s, key);
        System.out.println(encrypted);

        System.out.println("The decoded message is: ");
        System.out.println(decode(encrypted, key));

        System.out.println("The encoded (StringBuilder) message is: ");
        String encryptedSB = encodeSB(s, key);
        System.out.println(encryptedSB);

        System.out.println("The decoded (StringBuilder) message is: ");
        System.out.println(decodeSB(encryptedSB, key));

        sc.close();
    }

    /**
     * Encodes a message with the concat way.
     *
     * @param s   The message.
     * @param key The steps of encoding
     * @return The encoded message.
     */
    public static String encode(String s, int key) {
        String cipher = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                cipher += (char) (ch + key);
            } else {
                cipher += ch;
            }
        }
        return cipher;

    }
        /**
         * Decodes a message with the concat way.
         * @param s     The message.
         * @param key   The steps of encoding
         * @return      The decoded message.
         */
        public static String decode(String s,int key){
            String cipher = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != ' ') {
                    cipher += (char) (ch - key);
                } else {
                    cipher += ch;
                }
            }
            return cipher;
        }

        /**
         * Encodes a message with a StringBuilder.
         * @param s     The message.
         * @param key   The steps of encoding
         * @return      The encoded message.
         */
        public static String encodeSB(String s,int key){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != ' ') {
                    sb.append((char) (ch + key));
                } else {
                    sb.append(ch);
                }
            }
            return sb.toString();
        }

        /**
         * Decodes a message with a StringBuilder.
         * @param s     The message.
         * @param key   The steps of encoding
         * @return      The decoded message.
         */
        public static String decodeSB(String s,int key){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != ' ') {
                    sb.append((char) (ch - key));
                } else {
                    sb.append(ch);
                }
            }
            return sb.toString();
        }
    }
