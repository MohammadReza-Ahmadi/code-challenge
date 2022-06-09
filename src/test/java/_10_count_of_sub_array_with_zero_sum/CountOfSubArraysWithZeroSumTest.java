package _10_count_of_sub_array_with_zero_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountOfSubArraysWithZeroSumTest {

    @Test
    public void test_4() {
        int[] array = new int[]{4, -2, -1, 1, -2, 3, -3};
        int expected = calcCountByBruteForce(array);
        Assertions.assertEquals(expected, CountOfSubArraysWithZeroSum.countOfSubArray(array));
    }

    @Test
    public void test_8() {
        int[] array = new int[]{4, -2, -1, 1, -2, 3, -3, 1, 1, 3, -3, 5, -5};
        int expected = calcCountByBruteForce(array);
        ;
        Assertions.assertEquals(expected, CountOfSubArraysWithZeroSum.countOfSubArray(array));
    }

    @Test
    public void test_13() {
        int[] array = new int[]{4, -2, -1, 1, -2, 3, -3, 1, 1, 3, -3, 5, -5, 4, 1, -8, 5, -2};
        int expected = calcCountByBruteForce(array);
        ;
        Assertions.assertEquals(expected, CountOfSubArraysWithZeroSum.countOfSubArray(array));
    }

    @Test
    public void test_19() {
        int[] array = new int[]{4, -2, -1, 1, -2, 3, -3, 1, 1, 3, -3, 5, -5, 4, 1, -8, 5, -2, 20, 1, -19, 18, -8, -10};
        int expected = calcCountByBruteForce(array);
        ;
        Assertions.assertEquals(expected, CountOfSubArraysWithZeroSum.countOfSubArray(array));
    }

    public int calcCountByBruteForce(int[] array) {
        int count = 0;
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i];
            if (sum == 0)
                count++;

            for (int j = i + 1; j < array.length; j++) {
                sum += array[j];
                if (sum == 0)
                    count++;
            }
        }
        System.out.println("sum="+sum);
        System.out.println("count="+count);
        return count;
    }
}