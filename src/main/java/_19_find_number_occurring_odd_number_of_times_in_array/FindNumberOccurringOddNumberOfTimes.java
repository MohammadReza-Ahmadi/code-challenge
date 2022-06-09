package _19_find_number_occurring_odd_number_of_times_in_array;

public class FindNumberOccurringOddNumberOfTimes {

    public static int findNumber(int[] array) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret = ret ^ array[i];
        }
        return ret;
    }
}
