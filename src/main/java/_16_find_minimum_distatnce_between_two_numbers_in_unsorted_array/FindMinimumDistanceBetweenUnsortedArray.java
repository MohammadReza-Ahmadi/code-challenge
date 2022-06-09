package _16_find_minimum_distatnce_between_two_numbers_in_unsorted_array;

public class FindMinimumDistanceBetweenUnsortedArray {

    public static int findMinimumDistance(int[] array, int n1, int n2) {
        int x1 = -1;
        int x2 = -1;
        int minDistance = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n1) {
                x1 = i;
                if (x2 > -1 && x1 - x2 < minDistance)
                    minDistance = x1 - x2;

            } else if (array[i] == n2) {
                x2 = i;
                if (x1 > -1 && x2 - x1 < minDistance)
                    minDistance = x2 - x1;
            }
        }
        return minDistance;
    }
}
