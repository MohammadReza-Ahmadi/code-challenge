import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {


    @Test
    public void test1(){
         int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
         int[][] expected = {{1,6},{8,10},{15,18}};
         Assertions.assertArrayEquals(expected,MergeIntervals.merge(intervals));
    }

    @Test
    public void test2(){
         int[][] intervals = {{1,4},{2,3}};
         int[][] expected = {{1,4}};
         Assertions.assertArrayEquals(expected,MergeIntervals.merge(intervals));
    }

    @Test
    public void test3(){
         int[][] intervals = {{1,4},{0,0}};
         int[][] expected = {{0,0},{1,4}};
         Assertions.assertArrayEquals(expected,MergeIntervals.merge(intervals));
    }

}