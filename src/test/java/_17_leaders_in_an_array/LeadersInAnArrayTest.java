package _17_leaders_in_an_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeadersInAnArrayTest {

    @Test
    public void test_6(){
        int[] array = new int[]{16,17,4,3,5,2};
        int[] expected = new int[]{2,5,17};
        Assertions.assertArrayEquals(expected,LeadersInAnArray.printLeadersInAnArray(array));
    }

    @Test
    public void test_7(){
        int[] array = new int[]{4,8,12,10,11,2,1};
        int[] expected = new int[]{1,2,11,12};
        Assertions.assertArrayEquals(expected,LeadersInAnArray.printLeadersInAnArray(array));
    }

}