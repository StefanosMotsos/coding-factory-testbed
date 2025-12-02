package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Simple Bank program for {@link Exception} practice.
 * It allows the user deposit and withdraw, but the
 * amount they choose can't be negative.
 */
public class SimpleBank {
    static double balance = 500;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double amount = 0.0;
        int choice = 0;
        try {
            System.out.println("Please enter an amount: ");
            amount = sc.nextDouble();

            do {
                System.out.println("Deposit or withdraw? ");
                choice = sc.nextInt();

                if (choice != 0 && choice != 1) {
                    System.out.println("Error, please enter 0 or 1.");
                }

            } while (choice != 0 && choice != 1);
            switch (choice) {
                case 0 -> deposit(amount);
                case 1 -> withdraw(amount);
            }
        } catch (Exception e) {
            System.out.println("An error happened. Try again...");
        }
        System.out.println("Balance is: " + balance);
    }

    /**
     * Adds the amount to the bank account balance.
     * @param amount        User inputted deposit.
     * @throws Exception    Amount can't be negative.
     */
    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Amount cannot be negative");
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage());
            throw e;
        }
    }

    /**
     * Removes the amount to the bank account balance.
     * @param amount        User inputted withdraw.
     * @throws Exception    Amount can't be negative.
     */
    public static void withdraw(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Amount cannot be negative");
            if (amount > balance) throw new IllegalArgumentException("Amount must be less than balance.");
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage());
            throw e;
        }
    }

}
