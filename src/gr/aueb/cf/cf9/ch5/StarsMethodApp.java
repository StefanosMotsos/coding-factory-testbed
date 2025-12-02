package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * The user enters the amount of stars and
 * is given 5 options on how the stars will be printed
 * if he picks the 6 option, he exits the program.
 */
public class StarsMethodApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int stars = 0;

        while (true) {
            printMenu();
            choice = getOneInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Error in choice data input");
                continue;
            }
            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Please enter the amount of stars:");
            stars = getOneInt();

            if (!isStarValid(stars)) {
                System.out.println("Error in stars data input");
                continue;
            }
            printedStars(choice, stars);
        }
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static boolean isStarValid(int stars) {
        return stars > 0;
    }

    public static void starsHorizontal(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

    public static void starsVertical(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }
    }

    public static void nLineStars(int stars) {
        for(int j = 1; j <= stars; j++) {
            starsHorizontal(stars);
            System.out.println();
        }
        System.out.println();
    }
    public static void starsUpwards(int stars) {
        for(int j = 1; j <= stars; j++) {
            starsHorizontal(j);
            System.out.println();
        }
        System.out.println();
    }

    public static void starsDownwards(int stars) {
        for(int j = stars; j >= 1; j--) {
            starsHorizontal(j);
            System.out.println();
        }
        System.out.println();
    }

    public static void printedStars(int choice, int stars) {
        switch (choice) {
            case 1 -> starsHorizontal(stars);
            case 2 -> starsVertical(stars);
            case 3 -> nLineStars(stars);
            case 4 -> starsUpwards(stars);
            case 5 -> starsDownwards(stars);
            default -> {}
        }
    }
}

