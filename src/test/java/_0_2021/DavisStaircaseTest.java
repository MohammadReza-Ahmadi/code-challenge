package _0_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DavisStaircaseTest {

    @Test
    public void test_1(){
        int n = 3;
        int waysCount = DavisStaircase.stepPerms(n);
        System.out.println("waysCount="+waysCount);
        Assertions.assertEquals(4, waysCount);
    }

    @Test
    public void test_2(){
        int n = 4;
        int waysCount = DavisStaircase.stepPerms(n);
        System.out.println("waysCount="+waysCount);
        Assertions.assertEquals(7, waysCount);
    }

    @Test
    public void test_3(){
        int n = 5;
        int waysCount = DavisStaircase.stepPerms(n);
        System.out.println("waysCount="+waysCount);
        Assertions.assertEquals(13, waysCount);
    }

    @Test
    public void test_4(){
        int n = 1;
        int waysCount = DavisStaircase.stepPerms(n);
        System.out.println("waysCount="+waysCount);
        Assertions.assertEquals(1, waysCount);
    }


}