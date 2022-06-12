import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakingAnagramsTest {

    @Test
    public void test_1() {
        String a = "cde";
        String b = "abc";
        Assertions.assertEquals(4,MakingAnagrams.makeAnagram(a,b));
    }

    @Test
    public void test_2() {
        String a = "cde";
        String b = "dcf";
        Assertions.assertEquals(2,MakingAnagrams.makeAnagram(a,b));
    }

}