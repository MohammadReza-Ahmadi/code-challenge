package _0_2021._7_counting_sort;

import utils.MyUtils;

public class CountingSort {
    // Driver method
    public static void main(String args[]) {
        CountingSort countingSort = new CountingSort();
//        char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
//        MyUtils.countingSortCharArray(arr);

        int[] arr = new int[]{3, 1, 9, 2, 3, 1, 8, 5};
        MyUtils.countingSortIntArray(arr, 9);
        System.out.println("Sorted character array is:");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
        System.out.println();
    }


}
