package DSAFundamentals.Stack.Queue;
import java.util.ArrayDeque;
public class QueueDataStructure{
    public static void main(String[] args) {
        var queue = new ArrayDeque<Integer>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue.size());
        System.out.println(queue);
        var front = queue.peek();
        System.out.println(front);
        front = queue.poll();
        System.out.println(front);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.size());
    }
}