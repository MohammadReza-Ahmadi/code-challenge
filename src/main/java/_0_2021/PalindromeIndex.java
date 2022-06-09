package _0_2021;

public class PalindromeIndex {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        int pIndex = -1;
        int fIndex = 0;
        int lIndex = s.length() - 1;
        int prvLIndex = -1;
        boolean fRemove = false;
        boolean lRemove = false;
        while (fIndex < lIndex) {
            if (s.charAt(fIndex) == s.charAt(lIndex)) {
                fIndex++;
                lIndex--;
                continue;
            }

            if (!fRemove) {
                pIndex = fIndex;
                fIndex++;
                fRemove = true;
                prvLIndex = lIndex;

            } else if (!lRemove) {
                // rollback effect of checking first index char
                fIndex--;

                pIndex = Math.max(prvLIndex, lIndex);
                lIndex--;
                fRemove = false;
                lRemove = true;
            } else {
                return -1;
            }
        }

        return pIndex;
    }
}
