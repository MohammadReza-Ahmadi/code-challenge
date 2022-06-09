package _15_find_missing_number_in_array_no_minus_no_duplicate_numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMissingNumberTest {

    @Test
    public void test_4_3(){
        int[] arr = new int[]{1,2,4,5};
        int expected = 3;
        Assertions.assertEquals(expected,FindMissingNumber.findMissNumber_method1(arr));
        Assertions.assertEquals(expected,FindMissingNumber.findMissNumber_method2(arr));
    }

    @Test
    public void test_8_6(){
        int[] arr = new int[]{1,2,3,4,5,7,8,9};
        int expected = 6;
        Assertions.assertEquals(expected,FindMissingNumber.findMissNumber_method1(arr));
        Assertions.assertEquals(expected,FindMissingNumber.findMissNumber_method2(arr));
    }

}