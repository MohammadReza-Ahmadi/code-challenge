import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpecialStringAgainMyTest {

    @Test
    public void test_1() {
        String s = "non";
        Assertions.assertEquals(4, SpecialStringAgain_My.substrCount(s.length(), s));
    }

    @Test
    public void test_2() {
        String s = "mnonopoo";
        Assertions.assertEquals(12, SpecialStringAgain_My.substrCount(s.length(), s));
    }

    @Test
    public void test_3() {
        String s = "abcbaba";
        Assertions.assertEquals(10, SpecialStringAgain_My.substrCount(s.length(), s));
    }

}