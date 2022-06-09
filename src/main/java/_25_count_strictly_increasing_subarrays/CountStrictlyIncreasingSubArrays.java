package _25_count_strictly_increasing_subarrays;

public class CountStrictlyIncreasingSubArrays {

    public static int countSubArrays(int[] array) {
        int count = 0;
        int s = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                if (i - s > 1)
                    count += (i - s) * (i - s - 1) / 2;
                s = i;

            } else if (i == array.length - 1) {
                count += (i - s + 1) * (i - s) / 2;
            }
        }
        return count;
    }
}
