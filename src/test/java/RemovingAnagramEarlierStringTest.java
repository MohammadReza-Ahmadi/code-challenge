import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemovingAnagramEarlierStringTest {

    @Test
    public void test1(){
        Assertions.assertTrue(RemovingAnagramEarlierString.areAnagram("geeks","keegs"));
    }

    @Test
    public void test2(){
        Assertions.assertTrue(RemovingAnagramEarlierString.areAnagram("abcdefghikl","fbhcdgaikle"));
    }

    @Test
    public void test3(){
        String[] strArr = {"geeks", "keegs", "code", "doce"};
        String[] expected = {"code","geeks"};
        Assertions.assertArrayEquals(expected, RemovingAnagramEarlierString.removeAnagram(strArr));
    }

    @Test
    public void test4(){
        String[] strArr = {"tea", "ate", "anagram", "eat", "gramaan"};
        String[] expected = {"anagram","tea"};
        Assertions.assertArrayEquals(expected, RemovingAnagramEarlierString.removeAnagram(strArr));
    }

}