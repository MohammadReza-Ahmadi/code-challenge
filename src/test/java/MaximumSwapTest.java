import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSwapTest {

    @Test
    public void test1(){
        int num = 2736;
        int expected = 7236;
        Assertions.assertEquals(expected, MaximumSwap.maximumSwap(num));
    }

    @Test
    public void test2(){
        int num = 9973;
        int expected = 9973;
        Assertions.assertEquals(expected, MaximumSwap.maximumSwap(num));
    }

    @Test
    public void test3(){
        int num = 98368;
        int expected = 98863;
        Assertions.assertEquals(expected, MaximumSwap.maximumSwap(num));
    }

    @Test
    public void test4(){
        int num = 1993;
        int expected = 9913;
        Assertions.assertEquals(expected, MaximumSwap.maximumSwap(num));
    }

}