package _4_swap_nodes_algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {


    @Test
    public void test_3(){
        int[][] indexes = new int[][]{
                {2,3},
                {-1,-1},
                {-1,-1}
        };
        int[] queries = new int[]{1,1};
        Solution.swapNodes(indexes,queries);
    }

    @Test
    public void test_5(){
        int[][] indexes = new int[][]{
                {2,3},
                {-1,4},
                {-1,5},
                {-1,-1},
                {-1,-1}
        };
        int[] queries = new int[]{2};
        Solution.swapNodes(indexes,queries);
    }

    @Test
    public void test_11(){
        int[][] indexes = new int[][]{
                {2, 3},
                {4, -1},
                {5, -1},
                {6, -1},
                {7, 8},
                {-1, 9},
                {-1, -1},
                {10, 11},
                {-1, -1},
                {-1, -1},
                {-1, -1}
        };
        int[] queries = new int[]{2,4};
        Solution.swapNodes(indexes,queries);
    }

}