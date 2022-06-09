package _12_count_of_sub_arrays_with_equal_num_of_one_and_zero;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountOfSubArraysWithEqualNumOfOneAndZeroTest {


    @Test
    public void test_3() {
        int[] array = new int[]{0, 1, 0, 1};
        int expected = calcCountByBruteForce(array);
        Assertions.assertEquals(expected, CountOfSubArraysWithEqualNumOfOneAndZero.countOfSubArray(array));
    }

    @Test
    public void test_12() {
        int[] array = new int[]{0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int expected = calcCountByBruteForce(array);
        Assertions.assertEquals(expected, CountOfSubArraysWithEqualNumOfOneAndZero.countOfSubArray(array));
    }

    @Test
    public void test_24() {
        int[] array = new int[]{0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int expected = calcCountByBruteForce(array);
        Assertions.assertEquals(expected, CountOfSubArraysWithEqualNumOfOneAndZero.countOfSubArray(array));
    }

    @Test
    public void test_36() {
        int[] array = new int[]{0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1};
        int expected = calcCountByBruteForce(array);
        Assertions.assertEquals(expected, CountOfSubArraysWithEqualNumOfOneAndZero.countOfSubArray(array));
    }

    public int calcCountByBruteForce(int[] array) {
        int count = 0;
        int sum = 0;
        int givenSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i] = -1;
        }

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