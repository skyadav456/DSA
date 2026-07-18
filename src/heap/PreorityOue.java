package heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PreorityOue {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Collections.reverseOrder());
        pq.add(50);
        pq.add(20);
        pq.add(70);
        pq.add(10);
        System.out.println(pq);
    }
}
