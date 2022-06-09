package _0_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeIndexTest {

    @Test
    public void test_1() {
        String s = "aaab";
        int pIndex = PalindromeIndex.palindromeIndex(s);
        System.out.println("palindrome-index= " + pIndex);
        Assertions.assertEquals(3, pIndex);
    }

    @Test
    public void test_2() {
        String s = "baa";
        int pIndex = PalindromeIndex.palindromeIndex(s);
        System.out.println("palindrome-index= " + pIndex);
        Assertions.assertEquals(0, pIndex);
    }

    @Test
    public void test_3() {
//        String s = "hgygsvlf c wnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcw flvsgygh";
        String s = "hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh";
        int pIndex = PalindromeIndex.palindromeIndex(s);
        System.out.println("palindrome-index= " + pIndex);
        Assertions.assertEquals(44, pIndex);
    }

    @Test
    public void test_4() {
        String s = "ababcbkaba";
        int pIndex = PalindromeIndex.palindromeIndex(s);
        System.out.println("palindrome-index= " + pIndex);
        Assertions.assertEquals(6, pIndex);
    }

}