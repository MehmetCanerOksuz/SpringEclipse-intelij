import java.util.PriorityQueue;
import java.util.Queue;

public class AppMain {

    public static void main(String[] args) {

        Queue queue = new PriorityQueue();
        queue.add(100);
        queue.add(150);
        System.out.println(queue);

        Queue queue2 = new PriorityQueue();
        queue2.add("Aysu");
        queue2.add("Can");
        System.out.println(queue2);

        Queue queue3 = new PriorityQueue();
        queue3.add(3.14);
        queue3.add(5.87);
        System.out.println(queue3);

        Queue queue4 = new PriorityQueue();
        queue4.add(true);
        queue4.add(false);
        System.out.println(queue4);
    }
}
