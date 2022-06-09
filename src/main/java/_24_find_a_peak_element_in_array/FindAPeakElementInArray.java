package _24_find_a_peak_element_in_array;

public class FindAPeakElementInArray {

    public static int findPeakElement(int[] array) {
        return binarySearchForPeakElement(array, 0, array.length - 1);
    }

    private static int binarySearchForPeakElement(int[] array, int s, int e) {
        int m = (s + e) / 2;
        if ((m == 0 || array[m] >= array[m - 1]) && (m == array.length - 1 || array[m] >= array[m + 1]))
            return array[m];

        if (array[m] < array[m - 1])
            return binarySearchForPeakElement(array, s, m - 1);
        return binarySearchForPeakElement(array, m + 1, e);
    }
}
