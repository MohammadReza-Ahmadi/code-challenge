package _25_count_strictly_increasing_subarrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountStrictlyIncreasingSubArraysTest {


    @Test
    public void test3_1() {
        int[] array = new int[]{1, 4, 3};
        int expected = 1;
        Assertions.assertEquals(expected, CountStrictlyIncreasingSubArrays.countSubArrays(array));
    }

    @Test
    public void test4_2() {
        int[] array = new int[]{1, 2, 2, 4};
        int expected = 2;
        Assertions.assertEquals(expected, CountStrictlyIncreasingSubArrays.countSubArrays(array));
    }

    @Test
    public void test4_1() {
        int[] array = new int[]{1, 2, 3, 4};
        int expected = 6;
        Assertions.assertEquals(expected, CountStrictlyIncreasingSubArrays.countSubArrays(array));
    }

    @Test
    public void test12_9() {
        int[] array = new int[]{1, 2, 3, 2, 6, 9, 11, 9, 8, 7, 8, 9};
        int expected = 12;
        Assertions.assertEquals(expected, CountStrictlyIncreasingSubArrays.countSubArrays(array));
    }


}