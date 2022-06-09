package _0_2021;

import org.junit.jupiter.api.Test;

class StringScrambleTest {

    @Test
    public void test_1() {
        String s1 = "abc";
        String s2 = "cab";
        boolean scrambledStrings = StringScramble.hasScrambledStrings(s1, s2);
        System.out.println("ret= " + scrambledStrings);
    }

    @Test
    public void test_2() {
        String s1 = "abcjhy2e";
        String s2 = "jcyeahb";
//        boolean scrambledStrings = StringScramble.hasScrambledStrings(s1, s2);
        String scrambledStrings = StringScramble.StringScramble(s1, s2);
        System.out.println("ret= " + scrambledStrings);
    }

    @Test
    public void test_3() {
        String s1 = "Argument goes here...";
        String s2 = "Argument goes";
        String scrambledStrings = StringScramble.StringScramble(s1, s2);
        System.out.println("ret= " + scrambledStrings);
    }


}
