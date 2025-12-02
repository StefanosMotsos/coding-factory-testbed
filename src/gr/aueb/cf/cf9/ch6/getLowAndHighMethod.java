package gr.aueb.cf.cf9.ch6;

public class getLowAndHighMethod {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;
        int[] lowHighIndex = getLowAndHighIndexOf(arr, key);
        if (lowHighIndex.length == 2 ) {
            System.out.printf("The 1st position of the key is: %d\n", lowHighIndex[0]);
            System.out.printf("The 2nd position of the key is: %d\n", lowHighIndex[1]);
        } else {
            System.out.println("Key not found in array.");
        }
        }

        public static int[] getLowAndHighIndexOf ( int[] arr, int key){
            if (arr == null || arr.length == 0) return new int[0];
            int low = -1;
            int high = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    low = i;
                    break;
                }
            }
            if (low == -1) return new int[0];

            high = low;

            for (int i = low + 1; i < arr.length; i++) {
                if (arr[i] == arr[low]) {
                    high++;
                } else break;
            }
            return new int[]{low, high};
        }
    }

