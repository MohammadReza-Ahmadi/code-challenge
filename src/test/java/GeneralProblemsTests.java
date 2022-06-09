import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GeneralProblemsTests {

    @Test
    public void test_linked_list() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3));
        System.out.println(linkedList);
        linkedList.addFirst(0);
        System.out.println(linkedList);
        linkedList.addLast(23);
        System.out.println(linkedList);
        linkedList.remove(Integer.valueOf(2));
        System.out.println(linkedList);
        linkedList.add(3, -4);
        System.out.println(linkedList);

    }


    @Test
    public void test_queue() {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(1);
        q.add(9);
        q.add(4);

        System.out.println(q);
        System.out.println("head= "+q.peek());
        q.remove();
        System.out.println(q);
        q.add(12);
        System.out.println(q);


    }
}
