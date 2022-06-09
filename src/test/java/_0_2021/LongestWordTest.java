package _0_2021;

import org.junit.jupiter.api.Test;

class LongestWordTest {

    @Test
    public void test_1(){
        String str = "I am a Student";
        String longestWord = LongestWord.findLongestWord(str);
        System.out.println("longestWorld= "+longestWord);
    }

    @Test
    public void test_2(){
        String str = "OpenJDK 64-Bit Server12- VM warning: Sharing12 is only supported for boot loader classes because bootstrap classpath";
        String longestWord = LongestWord.findLongestWord(str);
        System.out.println("longestWorld= "+longestWord);
    }

    @Test
    public void test_3(){
        String str = "fun&!! time";
//        String str = "fun time";
//        String str = "abc abcd";
        String longestWord = LongestWord.findLongestWord(str);
        System.out.println("longestWorld= "+longestWord);
    }

    @Test
    public void test_4(){
        String str = "funtime";
        boolean isMatch = LongestWord.isWordOrNumber(str);
        System.out.println("isMatch= "+isMatch);
    }

    @Test
    public void test_5(){
//        String str = "fun&!! time";
//        String str = "aB3-e22D7";
        String str = "?";
        boolean isMatch = LongestWord.isWordOrNumber(str);
        System.out.println("isMatch= "+isMatch);
    }

}