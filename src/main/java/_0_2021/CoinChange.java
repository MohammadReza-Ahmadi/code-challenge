package _0_2021;

import java.util.List;

public class CoinChange {

    //by list input
    public static long getWays(int n, List<Long> c) {
        long[] ways = new long[n + 1];

        // Set the first way to 1 because its 0 and
        // there is 1 way to make 0 with 0 coins
        ways[0] = 1;

        // Go through all of the coins
        for (int i = 0; i < c.size(); i++) {

            // Make a comparison to each index value
            // of ways with the coin value.
            for (int j = 0; j < ways.length; j++) {
                if (c.get(i) <= j) {

                    // Update the ways array
                    ways[j] += ways[(int) (j - c.get(i))];
                }
            }
        }

        return ways[n];

    }



    // by array input
    public static long getNumberOfWays(int n, long[] c) {
        // Create the ways array to 1 plus the amount
        // to stop overflow
        System.out.println("coins array is: ");
        printArray(c);
        System.out.println("\nways array is: ");
        long[] ways = new long[n + 1];

        // Set the first way to 1 because its 0 and
        // there is 1 way to make 0 with 0 coins
        ways[0] = 1;

        // Go through all of the coins
        for (int i = 0; i < c.length; i++) {

            // Make a comparison to each index value
            // of ways with the coin value.
            for (int j = 0; j < ways.length; j++) {
                if (c[i] <= j) {

                    // Update the ways array
                    ways[j] += ways[(int) (j - c[i])];
                }
            }
        }

        // return the value at the Nth position
        // of the ways array.
        printArray(ways);
        return ways[n];
    }

    static void printArray(long[] coins) {
        for (long i : coins)
            System.out.print(i+" ");
    }

    public static void main(String args[]) {
        long Coins[] = {1, 5, 10};

        System.out.println("The Coins Array:");
        printArray(Coins);

        System.out.println("Solution:");
        System.out.println(getNumberOfWays(12, Coins));
    }
}
