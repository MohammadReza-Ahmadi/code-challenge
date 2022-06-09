package _22_first_positive_missing_integer_in_array_include_minus_and_duplicate_numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstPositiveMissingIntegerTest {

    @Test
    public void test_5_3() {
        int[] arr = new int[]{1, 2, 0, 4, 5};
        int expected = 3;
        Assertions.assertEquals(expected, FirstPositiveMissingInteger.findMissingInteger(arr));
    }

    @Test
    public void test_3_3() {
        int[] arr = new int[]{1, 2, 0};
        int expected = 3;
        Assertions.assertEquals(expected, FirstPositiveMissingInteger.findMissingInteger(arr));
    }

    @Test
    public void test_4_2() {
        int[] arr = new int[]{3, 4, -1, 1};
        int expected = 2;
        Assertions.assertEquals(expected, FirstPositiveMissingInteger.findMissingInteger(arr));
    }

}