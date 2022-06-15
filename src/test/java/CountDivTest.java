import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    @Test
    public void test1(){
        int A = 6;
        int B = 11;
        int K = 2;
        Assertions.assertEquals(3,CountDiv.solution(A,B,K));
    }

    @Test
    public void test2(){
        int A = 0;
        int B = 1;
        int K = 11;
        Assertions.assertEquals(1,CountDiv.solution(A,B,K));
    }

    @Test
    public void test3(){
        int A = 11;
        int B = 345;
        int K = 17;
        Assertions.assertEquals(20,CountDiv.solution(A,B,K));
    }

    @Test
    public void test4(){
        int A = 0;
        int B = 0;
        int K = 11;
        Assertions.assertEquals(1,CountDiv.solution(A,B,K));
    }

    @Test
    public void test5(){
        int A = 1;
        int B = 1;
        int K = 11;
        Assertions.assertEquals(0,CountDiv.solution(A,B,K));
    }

    @Test
    public void test6(){
        int A = 3;
        int B = 3;
        int K = 11;
        Assertions.assertEquals(0,CountDiv.solution(A,B,K));
    }

    @Test
    public void test7(){
        int A = 0;
        int B = 1;
        int K = 11;
        Assertions.assertEquals(1,CountDiv.solution(A,B,K));
    }

}