package gr.aueb.cf.cf9.ch18Challenges;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        int fibo = 1;
        if (n < 0) throw new IllegalArgumentException("Το n δεν μπορει να ειναι αρνητικο");
        if (n == 0) return num1;
        if (n == 1) return num2;
        for (int i = 2; i <= n; i++) {
            fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;
        }
        return fibo;
    }
}
