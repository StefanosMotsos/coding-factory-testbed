package gr.aueb.cf.cf9.ch12_13_14;

public class StringUtils {
    private StringUtils() {}

    public static String getReverse(String msg) {
        if (msg == null) return null;
        return new StringBuilder().reverse().toString();
    }

    public static String getUpper(String msg) {
        return msg.toUpperCase();
    }

    public static boolean isPalindrome(String msg) {
        return new StringBuilder(msg).reverse().toString().equals(msg);
    }


}
