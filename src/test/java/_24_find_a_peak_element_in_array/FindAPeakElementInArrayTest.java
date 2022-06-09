package _24_find_a_peak_element_in_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindAPeakElementInArrayTest {

    @Test
    public void test_7_20() {
        int[] array = new int[]{1, 3, 20, 4, 1, 0, 7};
        int expected = 20;
        Assertions.assertEquals(expected, FindAPeakElementInArray.findPeakElement(array));
    }

    @Test
    public void test_5_3() {
        int[] array = new int[]{3, 3, 3, 3, 3};
        int expected = 3;
        Assertions.assertEquals(expected, FindAPeakElementInArray.findPeakElement(array));
    }

    @Test
    public void test_5_50() {
        int[] array = new int[]{10, 20, 30, 40, 50};
        int expected = 50;
        Assertions.assertEquals(expected, FindAPeakElementInArray.findPeakElement(array));
    }

    @Test
    public void test_7_90() {
        int[] array = new int[]{10, 20, 15, 2, 23, 90, 67};
        int expected1 = 20;
        int expected2 = 90;
        int actual = FindAPeakElementInArray.findPeakElement(array);
        Assertions.assertTrue(actual == expected1 || actual == expected2);
    }

}