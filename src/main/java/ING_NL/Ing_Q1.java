package ING_NL;

import java.util.HashMap;
import java.util.Map;

/**
 * // Given an array of n elements such that elements may repeat. We can delete any number of elements from the array.
 * // The task is to find a minimum number of elements to be deleted from the array to make all remaining elements equal.
 *
 * // Examples:
 *
 * // Input: arr[] = {4, 3, 4, 4, 2, 4}
 * // Output: 2
 * // After deleting 2 and 3 from array, array becomes
 * // arr[] = {4, 4, 4, 4}
 *
 * // Input: arr[] = {1, 2, 3, 4, 5}
 * // Output: 4
 * // We can delete any four elements from array.
 */


public class Ing_Q1 {

    public static int findMinNumberOfDelete(int[] arr){

        if (arr.length <= 1){
            return 0;
        }

        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i < arr.length; i++){
            if (map.get(arr[i]) == null){
                map.put(arr[i],1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        int maxCount = -1;
        for (Integer i: map.values()){
            maxCount =  Math.max(maxCount, i);
        }

        return arr.length - maxCount;
    }

}
