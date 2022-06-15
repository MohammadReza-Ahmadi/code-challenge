import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenomicRangeQueryTest {

    // 80% correctness, performance 100%

    @Test
    public void test1(){
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int[] expected = {2,4,1};
        Assertions.assertArrayEquals(expected,GenomicRangeQuery.solution(S,P,Q));
    }

    @Test
    public void test2(){
        String S = "AC";
        int[] P = {0,0,1};
        int[] Q = {0,1,1};
        int[] expected = {1,1,2};
        Assertions.assertArrayEquals(expected,GenomicRangeQuery.solution(S,P,Q));
    }
}