package _11_count_of_sub_arrays_with_given_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountOfSubArraysWithGivenSumTest {


    @Test
    public void test_4() {
        int[] array = new int[]{4, -2, -1, 1, -2, 3, -3};
        int sum = 2;
        int expected = calcCountByBruteForce(array,sum);
        Assertions.assertEquals(expected, CountOfSubArraysWithGivenSum.countOfSubArray(array, sum));
    }

    @Test
    public void test_8() {
        int[] array = new int[]{4, -2, -1, 1, -2, 3, -3, 1, 1, 3, -3, 5, -5};
        int sum = 2;
        int expected = calcCountByBruteForce(array, sum);
        Assertions.assertEquals(expected, CountOfSubArraysWithGivenSum.countOfSubArray(array, sum));
    }

    @Test
    public void test_13() {
        int[] array = new int[]{4, -2, -1, 1, -2, 3, -3, 1, 1, 3, -3, 5, -5, 4, 1, -8, 5, -2};
        int sum = 2;
        int expected = calcCountByBruteForce(array, sum);
        Assertions.assertEquals(expected, CountOfSubArraysWithGivenSum.countOfSubArray(array,sum ));
    }

    @Test
    public void test_19() {
        int[] array = new int[]{4, -2, -1, 1, -2, 3, -3, 1, 1, 3, -3, 5, -5, 4, 1, -8, 5, -2, 20, 1, -19, 18, -8, -10};
        int sum = 2;
        int expected = calcCountByBruteForce(array, sum);
        Assertions.assertEquals(expected, CountOfSubArraysWithGivenSum.countOfSubArray(array, sum));
    }

    public int calcCountByBruteForce(int[] array, int givenSum) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i];
            if (sum == givenSum)
                count++;

            for (int j = i + 1; j < array.length; j++) {
                sum += array[j];
                if (sum == givenSum)
                    count++;
            }
        }
        System.out.println("sum=" + sum);
        System.out.println("count=" + count);
        return count;
    }

}