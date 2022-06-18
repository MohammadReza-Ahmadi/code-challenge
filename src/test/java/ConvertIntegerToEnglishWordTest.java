import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertIntegerToEnglishWordTest {

    @Test
    public void test1(){
        int digit = 652;
        System.out.println(ConvertIntegerToEnglishWord.convert(digit));
    }

    @Test
    public void test2(){
        int digit = 3457;
        String actual = ConvertIntegerToEnglishWord.convert(digit).trim();
        String expected = "three thousand four hundred fifty seven";
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int digit = 5067;
        String actual = ConvertIntegerToEnglishWord.convert(digit).trim();
        String expected = "five thousand sixty seven";
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        int digit = 62721;
        String actual = ConvertIntegerToEnglishWord.convert(digit).trim();
        String expected = "nine billion four million ";
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

/*
    @Test
    public void test4(){
        int digit = 9481903462;
        String actual = ConvertIntegerToEnglishWord.convert(digit).trim();
        String expected = "nine billion four million ";
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
*/

}