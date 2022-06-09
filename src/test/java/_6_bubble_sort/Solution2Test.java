package _6_bubble_sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2Test {

    @Test
    public void test_7() {
        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
        int[] expected = new int[]{-22, -15, 1, 7, 20, 35, 55};
        Assertions.assertArrayEquals(expected, Solution.bubbleSort(array));
    }

    @Test
    public void test_13() {
        int[] array = new int[]{9, -23, 5, -2, 20, 8, 200, 35, -15, 7, 55, 1, -22};
        int[] expected = new int[]{-23, -22, -15, -2, 1, 5, 7, 8, 9, 20, 35, 55, 200};
        Assertions.assertArrayEquals(expected, Solution.bubbleSort(array));
    }

}