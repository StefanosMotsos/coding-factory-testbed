package gr.aueb.cf.cf9.ch18Challenges;

import java.util.Arrays;

public class Candles {
    public static void main(String[] args) {
        int[] candles = {4, 4, 1, 3};
        System.out.println(countMaxCandleHeight(candles));

    }

    public static long countMaxCandleHeight(int[] candles) {
        int max = Arrays.stream(candles).max().orElse(0);
        return Arrays.stream(candles).filter(c -> c == max).count();
    }
}
