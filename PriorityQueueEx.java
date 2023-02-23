package JavaPract;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<String>(15, new MyComparator());
        pq.add("Erling Haaland");
        pq.add("Neymar Jr");
        pq.add("Marquinhos");
        pq.add("Emi Martinez");
        pq.add("Julian Alvarez");
        while(pq.size()!=0){
            System.out.println(pq.poll());
        }

    }
}
