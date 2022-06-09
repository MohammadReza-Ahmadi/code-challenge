package _19_find_number_occurring_odd_number_of_times_in_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindNumberOccurringOddNumberOfTimesTest {

    @Test
    public void test7_3() {
        int[] array = new int[]{1, 2, 3, 2, 3, 1, 3};
        int expected = 3;
        Assertions.assertEquals(expected, FindNumberOccurringOddNumberOfTimes.findNumber(array));
    }

    @Test
    public void test15_7() {
        int[] array = new int[]{4, 1, 3, 5, 4, 5, 8, 5, 4, 4, 3, 4, 5, 1, 4, 4, 8};
        int expected = 4;
        Assertions.assertEquals(expected, FindNumberOccurringOddNumberOfTimes.findNumber(array));
    }

}