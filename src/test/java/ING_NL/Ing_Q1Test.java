package ING_NL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ing_Q1Test {

    @Test
    public void test1(){
        int[] arr = {1, 2, 3, 4, 5};
        Assertions.assertEquals(4, Ing_Q1.findMinNumberOfDelete(arr));
    }

    @Test
    public void test2(){
        int[] arr = {4, 3, 4, 4, 2, 4};
        Assertions.assertEquals(2, Ing_Q1.findMinNumberOfDelete(arr));
    }

    @Test
    public void test3(){
        int[] arr = {4, 3, 4, 4, 2, 4, 2, 3};
        Assertions.assertEquals(4, Ing_Q1.findMinNumberOfDelete(arr));
    }

    @Test
    public void test4(){
        int[] arr = {4, 3, 4, 4, 2, 4, 2, 3, 2, 3, 2};
        Assertions.assertEquals(7, Ing_Q1.findMinNumberOfDelete(arr));
    }

}