package _9_longest_span_with_same_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSpanWithSameSumTest {

    @Test
    public void test_6() {
        int[] arr1 = new int[]{0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 0, 1};
        int expected = calcByBruteForce(arr1, arr2);
        Assertions.assertEquals(expected, LongestSpanWithSameSum.calcLongestSpan(arr1, arr2));
    }

    @Test
    public void test_10() {
        int[] arr1 = new int[]{0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1};
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0};
        int expected = calcByBruteForce(arr1, arr2);
        Assertions.assertEquals(expected, LongestSpanWithSameSum.calcLongestSpan(arr1, arr2));
    }

    @Test
    public void test_21() {
        int[] arr1 = new int[]{0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1};
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1};
        int expected = calcByBruteForce(arr1, arr2);
        Assertions.assertEquals(expected, LongestSpanWithSameSum.calcLongestSpan(arr1, arr2));
    }

    public int calcByBruteForce(int[] arr1, int[] arr2) {
        int maxLen = 0;


        for (int i = 0; i < arr1.length; i++) {
            int prefixSum1 = 0;
            int prefixSum2 = 0;

            for (int j = i; j < arr2.length; j++) {
                prefixSum1 += arr1[j];
                prefixSum2 += arr2[j];
                if (prefixSum1 == prefixSum2) {
                    int len = i == 0 ? j + 1 : j;
                    if (len > maxLen)
                        maxLen = len;
                }
            }
        }
        System.out.println("maxLen=" + maxLen);
        return maxLen;

    }

}