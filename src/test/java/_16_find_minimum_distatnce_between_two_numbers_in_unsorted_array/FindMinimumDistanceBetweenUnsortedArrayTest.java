package _16_find_minimum_distatnce_between_two_numbers_in_unsorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinimumDistanceBetweenUnsortedArrayTest {

    @Test
    public void test_3_2() {
        int[] array = new int[]{3, 4, 5};
        int n1 = 3;
        int n2 = 5;
        int expected = 2;
        Assertions.assertEquals(expected, FindMinimumDistanceBetweenUnsortedArray.findMinimumDistance(array, n1, n2));
    }

    @Test
    public void test_12_4() {
        int[] array = new int[]{3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int n1 = 3;
        int n2 = 6;
        int expected = 4;
        Assertions.assertEquals(expected, FindMinimumDistanceBetweenUnsortedArray.findMinimumDistance(array, n1, n2));
    }

    @Test
    public void test_21_2() {
        int[] array = new int[]{3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3, 17, 2, 15, 6, 19, 6, 21, 21, 3};
        int n1 = 3;
        int n2 = 6;
        int expected = 3;
        Assertions.assertEquals(expected, FindMinimumDistanceBetweenUnsortedArray.findMinimumDistance(array, n1, n2));
    }
}