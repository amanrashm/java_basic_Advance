package DSAFundamentals.Stack;
import java.util.LinkedList;
public class SIL {
    public static void main(String... args){
        var stack = new LinkedList<Integer>();
        stack.addFirst(10);
        stack.addFirst(20);
        stack.addFirst(30);
        stack.addFirst(40);
        System.out.println(stack.size());
        System.out.println(stack);
        var top = stack.peekFirst();
        System.out.println(top);
        top = stack.removeFirst();
        System.out.println(top);
        System.out.println(stack);
    }
}