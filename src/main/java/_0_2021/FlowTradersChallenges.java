package _0_2021;

/*
*
* */

import java.util.ArrayList;
import java.util.List;

public class FlowTradersChallenges {

    public static String findNumber(List<Integer> arr, int k) {
        return arr.contains(k)? "YES":"NO";
    }

    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i=l; i <=r; i++){
            if (i%2!=0){
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }





}