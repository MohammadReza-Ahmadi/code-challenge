package _0_2021;

import _0_2021.CoinChange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoinChangeTest {

    @Test
    public void test_1() {
        long coins[] = {1, 5, 10};
        long numberOfWays = CoinChange.getNumberOfWays(10, coins);
        Assertions.assertEquals(4, numberOfWays);
    }

    @Test
    public void test_2() {
        long coins[] = {1, 5, 10};
        long numberOfWays = CoinChange.getNumberOfWays(12, coins);
        Assertions.assertEquals(4, numberOfWays);
    }

    @Test
    public void test_3() {
        long coins[] = {1, 3, 7};
        long numberOfWays = CoinChange.getNumberOfWays(10, coins);
        Assertions.assertEquals(6, numberOfWays);
    }

    @Test
    public void test_4() {
        long coins[] = {3};
        long numberOfWays = CoinChange.getNumberOfWays(10, coins);
//        Assertions.assertEquals(4, numberOfWays);
    }


}