package _7_selection_sort;

public class Solution {


    public static int[] selectionSort(int[] array) {
        int maxIndex = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j] > array[maxIndex])
                    maxIndex = j;
            }
            swap(array, i, maxIndex);
            maxIndex=0;
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
