package _18_majority_element_by_moore_voting_algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MajorityElementByMooreVotingAlgorithmTest {

    @Test
    public void test7_2() {
        int[] array = new int[]{2, 2, 3, 5, 2, 2, 6};
        String expected = "2";
        Assertions.assertEquals(expected, MajorityElementByMooreVotingAlgorithm.findMajorityElementByMooreVotingAlgorithm(array));
    }

    @Test
    public void test12_7() {
        int[] array = new int[]{3, 7, 1, 7, 3, 7, 7, 7, 8, 7, 9, 7};
        String expected = "7";
        Assertions.assertEquals(expected, MajorityElementByMooreVotingAlgorithm.findMajorityElementByMooreVotingAlgorithm(array));
    }

    @Test
    public void test12_no() {
        int[] array = new int[]{6, 6, 6, 6, 3, 7, 7, 7, 8, 7, 9, 7};
        String expected = "No majority element!";
        Assertions.assertEquals(expected, MajorityElementByMooreVotingAlgorithm.findMajorityElementByMooreVotingAlgorithm(array));
    }

}