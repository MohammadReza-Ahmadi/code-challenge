package _23_find_fix_point_in_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindFixPointInSortedArrayTest {

    @Test
    public void test5_3() {
        int[] array = new int[]{-10, -5, 0, 3, 7};
        int expected = 3;
        Assertions.assertEquals(expected, FindFixPointInSortedArray.findFixPoint(array));
    }

    @Test
    public void test5_0() {
        int[] array = new int[]{0, 2, 5, 8, 17};
        int expected = 0;
        Assertions.assertEquals(expected, FindFixPointInSortedArray.findFixPoint(array));
    }

    @Test
    public void test6_1() {
        int[] array = new int[]{-10, -5, 3, 4, 7, 9};
        int expected = -1;
        Assertions.assertEquals(expected, FindFixPointInSortedArray.findFixPoint(array));
    }

    @Test
    public void test20_12() {
        int[] array = new int[]{-23,-19,-17,-13,-11,-2,0,2,4,5,9,10,12,15,17,25,50};
        int expected = 12;
        Assertions.assertEquals(expected, FindFixPointInSortedArray.findFixPoint(array));
    }

}