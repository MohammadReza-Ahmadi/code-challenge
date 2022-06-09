package _8_insertion_sort;

public class Solution {

    public static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int newElement= array[i];
            for (int j = i; j >0  && newElement< array[j-1]; j--) {
                array[i]=array[j-1];
            }
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        return array;
    }
}
