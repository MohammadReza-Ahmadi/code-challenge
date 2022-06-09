package _0_2021;

import java.util.Arrays;

public class StringScramble {

    public static boolean hasScrambledStrings(String str1, String str2) {
        if (str1 == null && str2 == null)
            return true;
        if (str1.isEmpty() && str2.isEmpty())
            return true;
        if (str1 == null || str2 == null)
            return false;
        if (str1.isEmpty() || str2.isEmpty())
            return false;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (chars2[j] == chars1[i]) {
                i++;
                j++;
            } else if (j > 0) {
                return false;
            } else {
                i++;
            }
        }
        return j == str2.length();
    }


    public static String StringScramble(String str1, String str2) {
        if (str1 == null && str2 == null)
            return "true";
        if (str1.isEmpty() && str2.isEmpty())
            return "true";
        if (str1 == null || str2 == null)
            return "false";
        if (str1.isEmpty() || str2.isEmpty())
            return "false";

        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
                j=0;
            }
        }
        return j == str2.length()? "true": "false";
    }
}
