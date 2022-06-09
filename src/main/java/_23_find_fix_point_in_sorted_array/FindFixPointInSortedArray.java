package _23_find_fix_point_in_sorted_array;

public class FindFixPointInSortedArray {

    public static int findFixPoint(int[] array) {
        return binarySearch(array, 0, array.length-1);
    }

    private static int binarySearch(int[] array, int s, int e) {
        if (s >= e && array[s]!=s)
            return -1;

        int i = (s + e) / 2;
        if (array[i] == i)
            return i;
        else if (array[i] > i + 1)
            return binarySearch(array, s, i-1);

        return binarySearch(array,i+1, e);
    }
}
