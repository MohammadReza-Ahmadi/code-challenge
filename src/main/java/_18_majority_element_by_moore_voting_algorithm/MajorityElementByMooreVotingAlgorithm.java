package _18_majority_element_by_moore_voting_algorithm;

public class MajorityElementByMooreVotingAlgorithm {

    public static String findMajorityElementByMooreVotingAlgorithm(int[] array) {
        int candidate = findCandidate(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == candidate)
                count++;
        }

        if (count > array.length / 2)
            return String.valueOf(candidate);
        else
            return "No majority element!";
    }

    private static int findCandidate(int[] array){
        int majority = 0;
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[majority])
                count++;
            else
                count--;

            if (count == 0) {
                majority = i;
                count++;
            }
        }
        return array[majority];
    }


}
