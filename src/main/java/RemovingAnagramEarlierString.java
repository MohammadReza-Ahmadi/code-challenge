import java.util.*;
import java.util.stream.Stream;

/**
 *
 *      * Removing string that is an anagram of an earlier string
 *      *
 *      * Difficulty Level : Medium
 *      * Last Updated : 24 Jan, 2022
 *      * Given an array arr of strings, the task is to remove the strings that are an anagram of an earlier string,
 *      * then print the remaining array in sorted order.
 *      *
 *      * Examples:
 *      *
 *      * Input: arr[] = { “geeks”, “keegs”, “code”, “doce” }, N = 4
 *      * Output: [“code”, “geeks”]
 *      * Explanation:
 *      * “geeks” and “keegs” are anagrams, so we remove “keegs”.
 *      * Similarly, “code” and “doce” are anagrams, so we remove “doce”.
 *      *
 *      * Input : arr[] = {“tea”, “ate”, “anagram”, “eat”, “gramaan”}, N = 5
 *      * Output : [“anagram”, “tea”]
 *      * Explanation: “ate” and “eat” are anagram of “tea”.
 *      * “gramaan” is an anagram of “anagram” hence, array becomes [“anagram”, “tea”].
 *      *
 *
 */

public class RemovingAnagramEarlierString {

    public static String[] removeAnagram(String[] strArr){
        Map<Integer, String> map = new HashMap<>();
        for (String str: strArr){
            int codeSum = getAsciiCodesSum(str);
            map.putIfAbsent(codeSum, str);
        }

        String[] ret = new String[map.values().size()];
        int i=0;
        for (String str: map.values()){
            ret[i] = str;
            i++;
        }
        Arrays.sort(ret);
        return ret;
    }

    public static boolean areAnagram(String str1, String str2){
        return getAsciiCodesSum(str1) == getAsciiCodesSum(str2);
    }

    private static int getAsciiCodesSum(String str){
        int codeSum = 0;
         for(int i=0; i < str.length(); i++){
             codeSum += str.charAt(i);
         }
         return codeSum;
    }
}
