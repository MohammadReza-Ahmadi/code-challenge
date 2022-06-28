import java.util.Arrays;

public class CommonChild {


    // longest common subsequence problem
    public static int commonChild(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m == 0 || n == 0) {
            return 0;
        }

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        printLCS(s1,s2,dp,m,n);
        return dp[m][n];
    }

    private static void printLCS(String s1, String s2, int[][] dp, int m, int n) {
        int index = dp[m][n];
        int[] subStr = new int[index];
        int i = m;
        int j = n;
        while (i > 0 && j > 0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                subStr[index-1]=s1.charAt(i-1);
                index--;
                i--;
                j--;

            } else if (dp[i-1][j] > dp[i][j-1]) {
                i--;
            } else {
                j--;
            }
        }
        Arrays.stream(subStr).forEach(c -> System.out.print((char)c));
        System.out.println();
    }

}
