package Lessons.lesson17;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("бананы");
        queue.add("яблоки");
        queue.add("ананасы");

        while (queue.peek() != null){
            System.out.println(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
