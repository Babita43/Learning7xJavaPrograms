package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;

import java.util.PriorityQueue;

public class ProgramQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("alpha");
        pq.offer("beta");
      //  pq.add("gamma"); it can also be used but we prefer offer keyword
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll()); // it deletes the first element of queue
        System.out.println(pq);
    }
}
