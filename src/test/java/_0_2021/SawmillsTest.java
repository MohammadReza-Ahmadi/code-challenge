package _0_2021;

import org.junit.jupiter.api.Test;

class SawmillsTest {

    @Test
    public void test_1() {
        int[] LEC = new int[]{2, 3, 1};
        new Sawmills().genOrderInMaxProfit(LEC);
    }

    @Test
    public void test_2() {
        int[] LEC = new int[]{1, 2, 1};
        new Sawmills().genOrderInMaxProfit(LEC);
    }
}
