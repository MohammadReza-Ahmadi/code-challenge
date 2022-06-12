import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonChildTest {


    @Test
    public void test1(){
        String s1="abcd";
        String s2="abdc";
        Assertions.assertEquals(3, CommonChild.commonChild(s1,s2));
    }

    @Test
    public void test2(){
        String s1="harry";
        String s2="sally";
        Assertions.assertEquals(2, CommonChild.commonChild(s1,s2));
    }

}