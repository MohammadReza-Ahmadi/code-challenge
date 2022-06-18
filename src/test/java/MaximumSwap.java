import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 670. Maximum Swap
 * Medium
 *
 * 2545
 *
 * 146
 *
 * Add to List
 *
 * Share
 * You are given an integer num. You can swap two digits at most once to get the maximum valued number.
 *
 * Return the maximum valued number you can get.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 2736
 * Output: 7236
 * Explanation: Swap the number 2 and the number 7.
 * Example 2:
 *
 * Input: num = 9973
 * Output: 9973
 * Explanation: No swap.
 *
 *
 * Constraints:
 *
 * 0 <= num <= 10^8
 * Accepted
 * 172,490
 * Submissions
 * 361,963
 *
 */

public class MaximumSwap {

    /*
    *  Input: num = 2736 => 2 7 3 6
     * Output: 7236      => 7 6 3 2
     *
     *  27367   => 2 7 3 6 7
     *  72367   => 7 7 6 3 2
     *
     *
     * num = 9936 =>  9 9 6 3
     * ret = 9963
    * */


    public static int maximumSwap(int num) {
        System.out.println(num);
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++){
            digits[i] = numStr.charAt(i) - '0';
        }

        int maxIndex = -1;
        for (int i=0; i < digits.length; i++){
            int max = digits[i];
            for (int j=i+1; j < digits.length; j++){
                if (digits[i] != digits[j] && digits[j] >= max){
                    max = digits[j];
                    maxIndex = j;
                }
            }

            if (maxIndex > -1){
                digits[maxIndex] = digits[i];
                digits[i] = max;
                break;
            }
        }

        StringBuilder sb = new StringBuilder(digits.length);
        for (int i=0; i < digits.length; i++){
            sb.append(digits[i]);
        }

        return Integer.parseInt(sb.toString());
    }



    public static int maximumSwap1(int num) {

        String numStr = String.valueOf(num);
        Character[] digits  = new Character[numStr.length()];
        for (int i=0; i < digits.length; i++){
            digits[i] = numStr.charAt(i);
        }
        Arrays.sort(digits, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder(numStr.length());
        for (int i=0; i < digits.length; i++){
            String first = String.valueOf(numStr.charAt(i));
            String second = String.valueOf(digits[i]);
            if (Integer.parseInt(second) > Integer.parseInt(first)){
                sb.append(second);
                int secIndex = numStr.indexOf(second);
                sb.append(first,secIndex,secIndex+1);
                for (int j=i+1; j < numStr.length(); j++){
                    if(sb.charAt(j) == ' '){
                        sb.append(numStr.charAt(j));
                    }
                }
                break;
            } else {
                sb.append(first);
            }
        }

        return Integer.parseInt(sb.toString());
    }

}
