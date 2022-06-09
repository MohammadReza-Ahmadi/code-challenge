package _1_tree_postorder_traversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.MyUtils;

import java.util.ArrayList;
import java.util.List;

class Solution2Test {

    @Test
    public void test_6() {
        int r = 6;
        int[] dataArr = new int[]{1, 2, 5, 3, 4, 6};
        int[] expected = new int[]{4,3,6,5,2,1};
        Node root = null;
        for (int i = 0; i < r; i++) {
            root = Solution.insert(root, dataArr[i]);
        }

        List<Integer> integers = Solution.postOrderInner(root, new ArrayList<>());
        int[] actual = MyUtils.convertIntegerListToArray(integers);
        Assertions.assertArrayEquals(expected, actual);
    }
}