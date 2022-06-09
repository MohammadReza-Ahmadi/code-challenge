package _0_2021;

public class CoinDeterminer {

    public static int coinDeterminer(int num) {
        // define coins array
        int coins[] = {1, 5, 7, 9, 11};

        // define array to keep required coins count for each value
        int coinsCountTb[] = new int[num + 1];

        // initialize first value of coins count array to zero
        coinsCountTb[0] = 0;

        // Initialize all table values as Max value of Integer
        for (int i = 1; i <= num; i++)
            coinsCountTb[i] = Integer.MAX_VALUE;

        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= num; i++) {
            // Update all values of coins count for coins smaller than i
            for (int j = 0; j < coins.length; j++)
                if (coins[j] <= i) {
                    int sub_res = coinsCountTb[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < coinsCountTb[i])
                        coinsCountTb[i] = sub_res + 1;
                }
        }

        if (coinsCountTb[num] == Integer.MAX_VALUE)
            return -1;

        return coinsCountTb[num];
    }
}
