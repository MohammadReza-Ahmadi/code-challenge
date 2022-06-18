import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    public void test1(){
        String str = "abc";
        String expected = "cba";
        Assertions.assertEquals(expected, ReverseString.reverseRecursively(str));
    }

}