package _14_union_and_intersection_of_two_sorted_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnionAndIntersectionOfTwoSortedArraysTest {


    @Test
    public void test_5_4() {
        int[] arr1 = new int[]{1, 3, 4, 5, 7};
        int[] arr2 = new int[]{2, 3, 5, 6};
        int[] expectedUnion = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expectedIntersection = new int[]{3, 5};
        Assertions.assertArrayEquals(expectedUnion, UnionAndIntersectionOfTwoSortedArrays.printUnion(arr1, arr2));
        Assertions.assertArrayEquals(expectedIntersection, UnionAndIntersectionOfTwoSortedArrays.printIntersection(arr1, arr2));
    }

    @Test
    public void test_10_10_minus_numbers() {
        int[] arr1 = new int[]{-11, -7, -3, -1, 0, 1, 3, 4, 5, 7};
        int[] arr2 = new int[]{-12, -6, -4, -3, -2, 0, 2, 3, 5, 6};
        int[] expectedUnion = new int[]{-12, -11, -7, -6, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7};
        int[] expectedIntersection = new int[]{-3, 0, 3, 5};
        Assertions.assertArrayEquals(expectedUnion, UnionAndIntersectionOfTwoSortedArrays.printUnion(arr1, arr2));
        Assertions.assertArrayEquals(expectedIntersection, UnionAndIntersectionOfTwoSortedArrays.printIntersection(arr1, arr2));
    }

    @Test
    public void test_11_13() {
        int[] arr1 = new int[]{8, 11, 17, 19, 20, 22, 24, 30, 35, 37, 38, 40};
        int[] arr2 = new int[]{6, 8, 9, 12, 17, 18, 21, 23, 24, 25, 29, 31, 36, 38, 39, 41};
        int[] expectedUnion = new int[]{6, 8, 9, 11, 12, 17, 18, 19, 20, 21, 22, 23, 24, 25, 29, 30, 31, 35, 36, 37, 38, 39, 40, 41};
        int[] expectedIntersection = new int[]{8, 17, 24, 38};
        Assertions.assertArrayEquals(expectedUnion, UnionAndIntersectionOfTwoSortedArrays.printUnion(arr1, arr2));
        Assertions.assertArrayEquals(expectedIntersection, UnionAndIntersectionOfTwoSortedArrays.printIntersection(arr1, arr2));
    }

    @Test
    public void test_9_7() {
        int[] arr1 = new int[]{1, 3, 4, 5, 7, 11, 12, 15, 17};
        int[] arr2 = new int[]{2, 3, 5, 6, 12, 15, 17};
        int[] expectedUnion = new int[]{1, 2, 3, 4, 5, 6, 7, 11, 12, 15, 17};
        int[] expectedIntersection = new int[]{3, 5, 12, 15, 17};
        Assertions.assertArrayEquals(expectedUnion, UnionAndIntersectionOfTwoSortedArrays.printUnion(arr1, arr2));
        Assertions.assertArrayEquals(expectedIntersection, UnionAndIntersectionOfTwoSortedArrays.printIntersection(arr1, arr2));
    }


}