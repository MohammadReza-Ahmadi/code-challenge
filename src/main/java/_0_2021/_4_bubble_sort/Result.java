package _0_2021._4_bubble_sort;

import java.util.Arrays;
import java.util.List;

public class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void main(String[] args) {
//        List<Integer> l = Arrays.asList(3, 2, 1);
        List<Integer> l = Arrays.asList(1,2,3);
        countSwaps(l);
    }


    public static void countSwaps(List<Integer> a) {
        int sc = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size() - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    sc++;
                }
            }
        }
        printArray(a, sc);
    }

    public static void printArray(List<Integer> a, int sc) {
        System.out.println("Array is sorted in " + sc + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }

}