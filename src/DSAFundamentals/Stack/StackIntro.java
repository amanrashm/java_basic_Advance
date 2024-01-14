package DSAFundamentals.Stack;
import java.util.Stack;
public class StackIntro {
    public static void main(String[] args) {
        var stack = new Stack<Integer>();
        //Adding to stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        // view top of stack
        System.out.println(stack.peek()+"\n");
        // remove from stack
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        // Size of stack
        System.out.println(stack.size());
    }
}