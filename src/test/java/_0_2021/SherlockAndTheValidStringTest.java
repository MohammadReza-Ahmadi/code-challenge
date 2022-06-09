package _0_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SherlockAndTheValidStringTest {

    @Test
    public void test_1() {
        String s = "abc";
        String valid = SherlockAndTheValidString.isValid(s);
        System.out.println("Result= " + valid);
        Assertions.assertEquals("YES", valid);
    }

    @Test
    public void test_2() {
        String s = "abcc";
        String valid = SherlockAndTheValidString.isValid(s);
        System.out.println("Result= " + valid);
        Assertions.assertEquals("YES", valid);
    }

    @Test
    public void test_3() {
        String s = "abccc";
        String valid = SherlockAndTheValidString.isValid(s);
        System.out.println("Result= " + valid);
        Assertions.assertEquals("NO", valid);
    }

    @Test
    public void test_4() {
        String s = "aabbcd";
        String valid = SherlockAndTheValidString.isValid(s);
        System.out.println("Result= " + valid);
        Assertions.assertEquals("NO", valid);
    }

    @Test
    public void test_5() {
        String s = "abcdefghhgfedecba";
        String valid = SherlockAndTheValidString.isValid(s);
        System.out.println("Result= " + valid);
        Assertions.assertEquals("YES", valid);
    }

    @Test
    public void test_6() {
        String s = "a";
        String valid = SherlockAndTheValidString.isValid(s);
        System.out.println("Result= " + valid);
        Assertions.assertEquals("YES", valid);
    }

    @Test
    public void test_7() {
        String s = "abbb";
        String valid = SherlockAndTheValidString.isValid(s);
        System.out.println("Result= " + valid);
        Assertions.assertEquals("YES", valid);
    }

}