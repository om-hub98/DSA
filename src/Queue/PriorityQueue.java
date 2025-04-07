package Queue;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Queue;

/**
 * @author omraj
 */
public class PriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new java.util.PriorityQueue<>(Collections.reverseOrder());
        queue.offer("D");
        queue.offer("A");
        queue.offer("I");
        queue.offer("H");
        queue.offer("K");
        queue.offer("O");

        System.out.println(queue);
    }
}
