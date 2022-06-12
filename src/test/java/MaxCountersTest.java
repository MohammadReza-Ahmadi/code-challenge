import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxCountersTest {

    @Test
    public void test1() {
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] expected = {3, 2, 2, 4, 2};
        Assertions.assertArrayEquals(expected, MaxCounters.solution(N, A));
    }
}