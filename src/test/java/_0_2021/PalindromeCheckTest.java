package _0_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {

    @Test
    public void test_1() {
        String s = "abcba";
        boolean isPalindrome = PalindromeCheck.isPalindrome(s);
        System.out.println("isPalindrome=" + isPalindrome);
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void test_2() {
        String s = "abba";
        boolean isPalindrome = PalindromeCheck.isPalindrome(s);
        System.out.println("isPalindrome=" + isPalindrome);
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void test_3() {
        String s = "abghba";
        boolean isPalindrome = PalindromeCheck.isPalindrome(s);
        System.out.println("isPalindrome=" + isPalindrome);
        Assertions.assertFalse(isPalindrome);
    }

    @Test
    public void test_4() {
        String s = "never odd or even";
        boolean isPalindrome = PalindromeCheck.isPalindrome(s);
        System.out.println("isPalindrome=" + isPalindrome);
        Assertions.assertTrue(isPalindrome);
    }

}