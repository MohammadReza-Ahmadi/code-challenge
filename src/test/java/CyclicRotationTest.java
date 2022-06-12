import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    @Test
    public void test_1() {
        int[] A = {3, 8, 9, 7, 6};
        int k = 3;
        int[] expected = {9, 7, 6, 3, 8};
        Assertions.assertArrayEquals(expected, CyclicRotation.solution(A,k));
    }

    @Test
    public void test_2() {
        int[] A = {1, 2, 3, 4};
        int k = 4;
        int[] expected = {1, 2, 3, 4};
        Assertions.assertArrayEquals(expected, CyclicRotation.solution(A,k));
    }

}