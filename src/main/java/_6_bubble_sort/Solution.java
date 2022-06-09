package _6_bubble_sort;

public class Solution {

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1])
                    swap(array, j, j+1);
            }
        }
        for (int i=0; i<array.length-1; i++)
            System.out.print(array[i] + " ");

        return array;
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
