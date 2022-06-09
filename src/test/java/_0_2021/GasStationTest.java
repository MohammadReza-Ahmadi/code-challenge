package _0_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GasStationTest {

    @Test
    public void test_leetcode_1() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int startIndex = GasStation.canCompleteCircuit(gas, cost);
        System.out.println("startIndex=" + startIndex);
        Assertions.assertEquals(3, startIndex);
    }

    @Test
    public void test_leetcode_2() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        int startIndex = GasStation.canCompleteCircuit(gas, cost);
        System.out.println("startIndex=" + startIndex);
        Assertions.assertEquals(-1, startIndex);
    }

    @Test
    public void test_coderbyte_1() {
        String[] strArr = {"4", "3:1", "2:2", "1:2", "0:1"};
        String startIndex = GasStation.GasStation(strArr);
        System.out.println("startIndex=" + startIndex);
        Assertions.assertEquals("1", startIndex);
    }

    @Test
    public void test_coderbyte_2() {
        String[] strArr = {"4","1:1","2:2","1:2","0:1"};
        String startIndex = GasStation.GasStation(strArr);
        System.out.println("startIndex=" + startIndex);
        Assertions.assertEquals("impossible", startIndex);
    }

    @Test
    public void test_coderbyte_3() {
        String[] strArr = {"4","0:1","2:2","1:2","3:1"};
        String startIndex = GasStation.GasStation(strArr);
        System.out.println("startIndex=" + startIndex);
        Assertions.assertEquals("4", startIndex);
    }

}