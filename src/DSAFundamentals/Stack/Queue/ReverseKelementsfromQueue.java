package DSAFundamentals.Stack.Queue;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
public class ReverseKelementsfromQueue {
    public static Queue<Integer> reverseQueue(int k, ArrayDeque<Integer> queue) {
        if (queue.isEmpty() || k > queue.size() || k < 0)
            return queue;
        if (k == 0)
            return queue;
        var stack = new ArrayDeque<Integer>();
        for (int i = 0; i < k; i++) {
            stack.push(Objects.requireNonNull(queue.poll()));
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.offer(queue.poll());
        }
        return queue;
    }
    public static void main(String... args){
        var sc = new java.util.Scanner(System.in);
        var queue = new ArrayDeque<Integer>();
        for(var i = 0; i <10; i++){
            queue.addLast(sc.nextInt());
        }
        System.out.println(reverseQueue(5, queue));
    }
}