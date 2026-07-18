package heap;

import java.util.PriorityQueue;

public class PreorityOue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(20);
        pq.add(70);
        pq.add(10);
        System.out.println(pq);
    }
}
