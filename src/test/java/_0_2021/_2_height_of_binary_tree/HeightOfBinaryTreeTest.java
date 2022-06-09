package _0_2021._2_height_of_binary_tree;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

class HeightOfBinaryTreeTest {
    @Test
    public void test_1() throws IOException {
        set_input_and_call_main("_0_2021/_2_height_of_binary_tree/HeightOfBinaryTree.txt");
    }

    private void set_input_and_call_main(String scenarioFileName) throws IOException {
        final InputStream original = System.in;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(scenarioFileName);
        System.setIn(is);
        HeightOfBinaryTree.main(null);
        System.setIn(original);
    }
}