package _0_2021._1_trie_insert_and_search;

import org.junit.jupiter.api.Test;

import java.io.InputStream;

class TrieInsertAndSearchTest {

    @Test
    public void test_1() {
        set_input_and_call_main("_0_2021/trie_insert_and_search/TrieInsertAndSearch-1.txt");
    }

    @Test
    public void test_2() {
        set_input_and_call_main("_0_2021/trie_insert_and_search/TrieInsertAndSearch-2.txt");
    }

    private void set_input_and_call_main(String scenarioFileName) {
        final InputStream original = System.in;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(scenarioFileName);
        System.setIn(is);
        TrieInsertAndSearch.main(null);
        System.setIn(original);
    }


}