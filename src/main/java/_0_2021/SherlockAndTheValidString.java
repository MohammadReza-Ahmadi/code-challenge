package _0_2021;

import java.util.Arrays;

public class SherlockAndTheValidString {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        // Write your code here
        if (s == null || s.isEmpty())
            return "NO";

        // if string length is one
        if (s.length()==1) return "YES";

        int[] allCharArr = new int[26];

        s.chars().forEach(asci -> allCharArr[asci - 97]++);
        int[] charArr = Arrays.stream(allCharArr).filter(i -> i > 0).toArray();
        Arrays.sort(charArr);

        int first = charArr[0];
        int second = charArr[1];
        int secondLast = charArr[charArr.length - 2];
        int last = charArr[charArr.length - 1];

        // If first and last are same, then all frequencies are same
        if (first == last) return "YES";

        // If first is 1, and all other characters have 1 frequency
        if (first == 1 && second == last) return "YES";

        // If all are same and last character has just 1 extra count
        if (first == second && second == secondLast && secondLast == (last - 1)) return "YES";

        // Else invalid string
        return "NO";
    }

}
