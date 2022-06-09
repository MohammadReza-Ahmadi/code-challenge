package _0_2021;

public class PalindromeCheck {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static boolean isPalindrome(String str) {
        int f = 0;
        int l = str.length() - 1;
        while (f < l) {
            if (str.charAt(f) == ' ') {
                f++;
                continue;
            }

            if (str.charAt(l) == ' ') {
                l--;
                continue;
            }
            if (str.charAt(f) != str.charAt(l)) {
                return false;
            }
            f++;
            l--;
        }

        return true;
    }

}
