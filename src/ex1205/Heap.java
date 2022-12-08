package ex1205;


import java.util.PriorityQueue;
import java.util.Queue;

public class Heap {
    public static void main(String[] args) {
        int[] scoville={1, 2, 3, 9, 10, 12};
        int K = 7;
        int answer=1;

        Queue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        int f=pq.poll();
        int s=pq.poll();

        while(f+(2*s)<K){
            f=pq.poll();
            s=pq.poll();
            answer++;
        }

        System.out.println(answer);
    }

}
