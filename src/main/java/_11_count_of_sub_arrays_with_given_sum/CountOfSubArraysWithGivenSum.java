package _11_count_of_sub_arrays_with_given_sum;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubArraysWithGivenSum {

    public static int countOfSubArray(int[] array, int sum) {
        Map<Integer, Integer> aux = new HashMap<>();
        int prefixSum = 0;
        int zeroSumCount = 0;

        aux.put(prefixSum, 1);
        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];
            aux.putIfAbsent(prefixSum, 0);
            int count = aux.get(prefixSum);
            aux.put(prefixSum, ++count);

            int subCount;
            if (aux.get(prefixSum - sum) != null &&  (subCount = aux.get(prefixSum - sum)) >= 1) {
                zeroSumCount += subCount;
            }
        }
        return zeroSumCount;
    }
}
