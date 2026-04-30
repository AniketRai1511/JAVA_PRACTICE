package queue;
import java.util.*;
public class queue_default {
    public static void main(String[] args) {
        Queue<Integer> queue =new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        int size=queue.size();
        System.out.println(size);
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
        System.out.println();
        System.out.print(queue.isEmpty());
    }
}
