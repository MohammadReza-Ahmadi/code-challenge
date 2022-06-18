import javax.print.DocFlavor;
import java.util.*;

/**
 *
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 *
 *
 * Example 1:
 *
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * Example 2:
 *
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 *
 *
 * Constraints:
 *
 * 1 <= intervals.length <= 104
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 104
 */

public class MergeIntervals {


    /*
    * example:
    * [1,3],[2,6],[8,10],[15,18]
    * []
    *
    *  ------
    *   ------
    *  [2,5], [4, 8]
    *
    * --------
    *   ---
    *  [1,4], [2,3]
    *  [3,6], [2,8]
    *
    *    ------
    *  -----
    * [4,8] , [2,7]
    *  [-1,-1] , [2,8]
    * */

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval: intervals){
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }


//        Set<String> hash = new HashSet<>();
//        Iterator<String> it = hash.iterator();
//        while(it.hasNext()){
//            it.next();
//        }


        return merged.toArray(new int[merged.size()][]);
    }

    public static int[][] merge2(int[][] intervals) {
        int mergeCount = 0;
        for(int i=0; i < intervals.length - 1; i++){
            mergeCount = mergeHelper(intervals,i,i+1, mergeCount);
        }

        int[][] ret = new int[intervals.length - mergeCount][2];
        int c = 0;
        for (int i=0; i < intervals.length; i++){
            if (intervals[i][0] > -1){
                ret[c++] = intervals[i];
            }
        }

        return ret;
    }

    // [1,4], [2,3]
    private static int mergeHelper(int[][] intervals, int i, int j, int mergeCount){
        if(
                (intervals[i][0] >= intervals[j][0] && intervals[i][0] <= intervals[j][1]) ||
                (intervals[i][1] >= intervals[j][0] && intervals[i][1] <= intervals[j][1]) ||
                (intervals[i][0] < intervals[j][0] && intervals[i][1] > intervals[j][1])
        ){
            int start = Math.min(intervals[i][0],intervals[j][0]);
            int end = Math.max(intervals[i][1],intervals[j][1]);
            intervals[i] = new int[]{-1,-1};
            intervals[j] = new int[]{start,end};
            mergeCount++;
        }
        return mergeCount;
    }


    public static int[][] merge1(int[][] intervals) {

        for(int i=0; i < intervals.length; i++){
            for(int j=i; j < intervals.length; j++){

                if(
                   (intervals[i][0] >= intervals[j][0] && intervals[i][0] <= intervals[j][1]) ||
                   (intervals[i][1] >= intervals[j][0] && intervals[i][1] <= intervals[j][1])
                ){
                    int start = Math.min(intervals[i][0],intervals[j][0]);
                    int end = Math.max(intervals[i][1],intervals[j][1]);
                    intervals[i] = new int[]{-1,-1};
                    intervals[j] = new int[]{start,end};

                }
            }

        }

        return null;
    }
}
