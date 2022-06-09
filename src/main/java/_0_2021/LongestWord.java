package _0_2021;

import java.util.regex.Pattern;

public class LongestWord {

    public static String findLongestWord(String sen) {
        if (sen == null)
            return null;
        if (sen.isEmpty() || sen.length() == 1)
            return sen;
        int len = 0;
        int ts = 0;
        int s = 0;
        int l = 0;
        for (int i = 1; i < sen.length(); i++) {
            boolean isLastChar = i == sen.length() - 1;
            if (sen.charAt(i) == ' ' || !isWordOrNumber(String.valueOf(sen.charAt(i))) || isLastChar) {
                if (i - ts > len || (isLastChar && i - ts + 1 > len)) {
                    len = i - ts;
                    s = ts;
                    l = isLastChar ? i + 1 : i;
                }
                ts = i + 1;
            }
        }

        return sen.substring(s, l);
    }

    public static boolean isWordOrNumber(CharSequence str) {
        if (Pattern.matches("([a-zA-Z]*[0-9]*)+", str)) {
            return true;
        }
        return false;
    }
}
