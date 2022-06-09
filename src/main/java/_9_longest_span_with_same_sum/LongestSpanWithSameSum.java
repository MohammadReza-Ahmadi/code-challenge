package _9_longest_span_with_same_sum;

public class LongestSpanWithSameSum {

    public static int calcLongestSpan(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] diffs = new int[2 * n + 1];
        for (int i = 0; i < n; i++)
            diffs[i] = -1;

        int prefixSum1 = 0;
        int prefixSum2 = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            prefixSum1 += arr1[i];
            prefixSum2 += arr2[i];

            int currDif = prefixSum1 - prefixSum2;
            int difIndex = n + currDif;

            if (currDif == 0) {
                maxLen = i + 1;
            } else if (diffs[difIndex] == -1) {
                diffs[difIndex] = i;
            } else {
                int len = i - diffs[difIndex];
                if (len > maxLen)
                    maxLen = len;
            }
        }
        return maxLen;
    }
}
