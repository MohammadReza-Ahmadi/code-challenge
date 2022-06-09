package _0_2021._5_mark_and_toys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Result {

    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */

    public static void main(String[] args) {
//        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        List<Integer> l = Arrays.asList(1, 12, 5, 111, 200, 1000, 10);
        int r = maximumToys(l, 50);
        System.out.println(r);
    }

    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);
        var ref = new Object() {
            long s = 0;
        };

        

        List<Integer> list = prices.stream().filter(i -> {
            boolean b = ref.s + i <= k;
            System.out.print("s=" + ref.s + " , i=" + i + " , s+i=" + (ref.s + i) + " , b=" + b + "\n");
            ref.s += i;
            return b;
        }).collect(Collectors.toList());

        list.stream().forEach(i -> System.out.print("+" + i));
        System.out.println();
//        System.out.println(list);
        return list.size();
    }

}