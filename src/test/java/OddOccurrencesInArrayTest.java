import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {

    @Test
    public void test_1() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        Assertions.assertEquals(7 , OddOccurrencesInArray.solution(A));
    }

}