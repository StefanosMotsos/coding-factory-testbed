package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class MaxCars {
    public static void main(String[] args) {
        int[][] arr = {
                {1012, 1136},
                {1317, 1417},
                {1015, 1020}
        };

        int maxCars = getMaxCars(arr);
        System.out.println("Maximum cars parked at the same time: " + maxCars);
    }
    public static int getMaxCars(int[][] arr) {
        int[][] garage = new int[arr.length * 2][2];

        int moment = 0;
        for (int i = 0; i < arr.length; i++) {
            garage[moment][0] = arr[i][0];
            garage[moment][1] = 1;
            moment++;

            garage[moment][0] = arr[i][1];
            garage[moment][1] = 0;
            moment++;
        }

        Arrays.sort(garage, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        int currentCars = 0;
        int maxCars = 0;

        for (int i = 0; i < garage.length; i++) {
            if (garage[i][1] == 1) {
                currentCars++;
            } else {
                currentCars--;
            }

            if (currentCars > maxCars) {
                maxCars = currentCars;
            }
        }

        return maxCars;
    }
}



