package _3_height_of_binary_search_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2Test {


    @Test
    public void test_6_3() {
        int[] dataArr = new int[]{3, 5, 2, 1, 4, 6, 7};
        int expected = 3;
        Node root = null;
        for (int i = 0; i < dataArr.length; i++) {
            root = Solution.insert(root, dataArr[i]);
        }

        int actual = Solution.height(root);
        Assertions.assertEquals(expected,actual);
    }

}