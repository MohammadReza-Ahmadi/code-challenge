package _12_count_of_sub_arrays_with_equal_num_of_one_and_zero;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubArraysWithEqualNumOfOneAndZero {

    public static int countOfSubArray(int[] array) {

        for(int i=0; i<array.length; i++){
            if(array[i]==0)
                array[i]=-1;
        }

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
