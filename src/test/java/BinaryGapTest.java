import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryGapTest {

    @Test
    public void test_1() {
        int actual = BinaryGap.solution(9);
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void test_2() {
        int actual = BinaryGap.solution(529);
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void test_3() {
        int actual = BinaryGap.solution(32);
        Assertions.assertEquals(0, actual);
    }

}