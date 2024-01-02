package Arrays;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Concat_Array {
    public static int[] concat (int [] array){
        int n = array.length;
        int [] result = new int[2 * n];
        IntStream.range(0, n).forEachOrdered(i -> {
            result[i] = array[i];
            result[i + n] = array[i];
        });
        return result;
    }
    public static void main(String[] args) {
        int [] n = {1,2,1};
        System.out.println(Arrays.toString(concat(n)));
    }
}