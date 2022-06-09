package _0_2021._6_fraudulent_activity_notifications;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Result {

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */


    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code here
//        System.out.println("expenditure: " + expenditure);
        int notCount = 0;
        if (expenditure.size() < d)
            return notCount;

        int li = d;
        LinkedList<Integer> expLinkedList = new LinkedList<>(expenditure.subList(0, li));
        int max = Collections.max(expLinkedList);
        do {
//            System.out.println("expLinkList: " + expLinkedList);
            countingSortIntArray(expLinkedList, max);
            float median = calcMedian(expLinkedList, d);
//            System.out.println("median: " + median);
            if (expenditure.get(li) >= median * 2)
                notCount++;


            // remove first item of previous list
            expLinkedList.remove(expenditure.get(li - d));
            expLinkedList.addLast(expenditure.get(li));
            max = expenditure.get(li) > max ? expenditure.get(li) : max;

            li++;
        } while (li < expenditure.size());

//        System.out.println("notCount: " + notCount);
        return notCount;
    }

    public static float calcMedian(List<Integer> list, int d) {
        if (list.size() % 2 == 0) {
            int midIndex = (list.size() / 2) - 1;
            return (((float) list.get(midIndex) + (float) list.get(midIndex + 1)) / 2);

        } else {
            return list.get(list.size() / 2);
        }
    }

    // a implementation of counting sort algorithm for int array input
    // this method sort input array and change order into input array
    public static void countingSortIntArray(LinkedList<Integer> arr, int maxValue) {
        int n = arr.size();

        // The output character array that will have sorted arr
        int output[] = new int[n];

        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[maxValue + 1];
        for (int i = 0; i < maxValue; ++i)
            count[i] = 0;

        // store count of each character
        for (int i = 0; i < n; ++i)
            ++count[arr.get(i)];

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= maxValue; ++i)
            count[i] += count[i - 1];

        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr.get(i)] - 1] = arr.get(i);
            --count[arr.get(i)];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i)
            arr.set(i, output[i]);
    }

}
