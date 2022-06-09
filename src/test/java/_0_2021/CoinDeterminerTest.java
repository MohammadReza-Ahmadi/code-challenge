package _0_2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinDeterminerTest {

    @Test
    public void test_1(){
        int minExchangeNum = CoinDeterminer.coinDeterminer(16);
        System.out.println(minExchangeNum);
    }

}