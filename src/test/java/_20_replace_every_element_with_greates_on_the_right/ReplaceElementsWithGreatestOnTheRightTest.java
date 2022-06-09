package _20_replace_every_element_with_greates_on_the_right;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReplaceElementsWithGreatestOnTheRightTest {


    @Test
    public void test_6() {
        int[] array = new int[]{16, 17, 4, 3, 5, 2};
        int[] expected = new int[]{17, 5, 5, 5, 2, -1};
        Assertions.assertArrayEquals(expected,ReplaceElementsWithGreatestOnTheRight.replaceElements(array));
    }

    @Test
    public void test_11() {
        int[] array = new int[]   {4,5,8,6,1,7,3,4,10,2};
        int[] expected = new int[]{10,10,10,10,10,10,10,10,2,-1};
        Assertions.assertArrayEquals(expected,ReplaceElementsWithGreatestOnTheRight.replaceElements(array));
    }
}