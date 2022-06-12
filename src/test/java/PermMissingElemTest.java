import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    @Test
    public void test_1() {
        int[] A = {1,2,3,5};
        Assertions.assertEquals(4,PermMissingElem.solution(A));
    }

    @Test
    public void test_2() {
        int[] A = {1,3};
        Assertions.assertEquals(2,PermMissingElem.solution(A));
    }

    @Test
    public void test_3() {
        int[] A = {2};
        Assertions.assertEquals(1,PermMissingElem.solution(A));
    }

}