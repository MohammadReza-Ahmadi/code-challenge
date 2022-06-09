package _17_leaders_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {

    public static int[] printLeadersInAnArray(int[] array) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = array[array.length - 1];
        leaders.add(maxFromRight);
        for (int i = array.length - 2; i > 0; i--) {
            if (array[i] > maxFromRight) {
                maxFromRight = array[i];
                leaders.add(maxFromRight);
            }
        }

        for (int i = 0; i < leaders.size(); i++) {
            System.out.print(leaders.get(i) + (i < leaders.size() - 1 ? ", " : ""));
        }

        return leaders.stream().mapToInt(n->n).toArray();
    }
}
