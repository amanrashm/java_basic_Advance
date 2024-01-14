package DSAFundamentals.Stack.Queue;

import java.util.LinkedList;

public class QIL {
    public static void main(String... args){
        var queue = new LinkedList<Integer>();
        queue.addLast(10);
        queue.addLast(20);
        queue.addLast(30);
        queue.addLast(40);
        System.out.println(queue.size());
        System.out.println(queue);
        var front = queue.peekFirst();
        System.out.println(front);
        front = queue.removeFirst();
        System.out.println(front);
        System.out.println(queue);
    }
}