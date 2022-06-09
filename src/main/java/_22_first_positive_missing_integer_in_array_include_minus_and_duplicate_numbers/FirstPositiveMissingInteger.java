package _22_first_positive_missing_integer_in_array_include_minus_and_duplicate_numbers;

import java.util.Arrays;

public class FirstPositiveMissingInteger {

    public static int findMissingInteger(int[] array) {
        Arrays.sort(array);
        int total = 0;
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && (i == 0 || array[i] > array[i - 1])) {
                total += array[i];
                n++;
            }
        }
        int sum = (n + 1) * (n + 2) / 2;
        return sum - total;
    }
}
