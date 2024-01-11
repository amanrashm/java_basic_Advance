package Arrays.matrix;
import java.util.*;
public class OrderedStream {
    private int ptr = 0;
    private String[] stream;
    public OrderedStream(int n) {
        stream = new String[n];
    }
    public String[] insert(int idKey, String value) {
        stream[idKey - 1] = value;
        int oldPtr = ptr;
        while (ptr < stream.length && stream[ptr] != null) {
            ptr++;
        }
        String[] res = new String[ptr - oldPtr];
        System.arraycopy(stream, oldPtr, res, 0, ptr - oldPtr);
        return res;
    }
    public static void main(String... args) {
        OrderedStream os = new OrderedStream(5);
        System.out.println(Arrays.toString(os.insert(3, "ccccc")));
        System.out.println(Arrays.toString(os.insert(1, "aaaaa")));
        System.out.println(Arrays.toString(os.insert(2, "bbbbb")));
        System.out.println(Arrays.toString(os.insert(5, "eeeee")));
        System.out.println(Arrays.toString(os.insert(4, "ddddd")));
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */