package _0_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sawmills {

    private List<int[]> orders = new ArrayList<>();
    private List<Integer> lastItems = new ArrayList<>();
    private int maxProfit = 0;

    public void genOrderInMaxProfit(int[] trunks) {
        iterAlPermutation(trunks, 0);
        System.out.println("Max profit: " + maxProfit);
        for (int[] order : orders) {
            printTrunks(order);
            System.out.println();
        }

    }


    private void iterAlPermutation(int[] trunks, int s) {
        if (s == trunks.length - 1) {
            int profit = calcTrunksRangeProfit(trunks, 0, 0, 3, 0);
            System.out.println(" ---- trunks ------> profit= " + profit);
            printTrunks(trunks);
            if (profit >= maxProfit /*&& !lastItems.contains(trunks[trunks.length - 1])*/) {
                if (profit == maxProfit && orders.size() > 0 && lastItems.contains(trunks[trunks.length - 1]))
                    orders.remove(orders.size() - 1);
                maxProfit = profit;
                orders.add(Arrays.copyOf(trunks, trunks.length));
                lastItems.add(trunks[trunks.length - 1]);
            }
        }

        for (int i = s; i < trunks.length; i++) {
            swap(trunks, i, s);
            iterAlPermutation(trunks, s + 1);
            swap(trunks, i, s);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private boolean isTrunksEqual(int[] t1, int[] t2){
        for (int i=0; i < t1.length; i++){
            if (t1[i]!=t2[i])
                return false;
        }
        return true;
    }

    private int calcTrunksRangeProfit(int[] trunks, int trunkIndex, int trunkRemLen, int cutLen, int profitSum) {
        if (trunkIndex == trunks.length)
            return profitSum;
        int trunkLen = trunkRemLen > 0 ? trunkRemLen : trunks[trunkIndex];
        if (cutLen <= 0)
            return calcTrunksRangeProfit(trunks, trunkIndex + 1, 0, 3, profitSum);

        if (cutLen >= trunkLen) {
            profitSum += calcTrunkPieceProfit(trunkLen);
            return calcTrunksRangeProfit(trunks, trunkIndex + 1, 0, cutLen - trunkLen, profitSum);

        } else {
            int remLen = trunkLen - cutLen;
            profitSum += calcTrunkPieceProfit(cutLen);
            return calcTrunksRangeProfit(trunks, trunkIndex, remLen, 3, profitSum);
        }
    }

    private int calcTrunkPieceProfit(int trunkLen) {
        if (trunkLen == 1)
            return -1;
        if (trunkLen == 2)
            return 3;
        if (trunkLen == 3)
            return 1;
        return 0;
    }

    //todo: should be removed
    private void printTrunks(int[] trunks) {
        System.out.print("[");
        for (int i = 0; i < trunks.length; i++) {
            System.out.print(trunks[i]);
            if (i < trunks.length - 1)
                System.out.print(" ");
        }
        System.out.print("]");
        System.out.println();
    }

}
