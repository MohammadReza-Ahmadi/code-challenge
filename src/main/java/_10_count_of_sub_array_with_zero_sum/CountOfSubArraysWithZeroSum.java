package _10_count_of_sub_array_with_zero_sum;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubArraysWithZeroSum {

    public static int countOfSubArray(int[] array) {
        Map<Integer, Integer> aux = new HashMap<>();
        int prefixSum = 0;
        int zeroSumCount = 0;

        aux.put(prefixSum, 1);
        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];
            aux.putIfAbsent(prefixSum, 0);
            int count = aux.get(prefixSum);
            aux.put(prefixSum, ++count);

            if (count > 1) {
                zeroSumCount += (count - 1);
            }
        }
        return zeroSumCount;
    }
}
