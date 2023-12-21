package Arrays;
import java.util.Arrays;
public class Concat_Array {
    public static int[] concat (int [] array){
        int n = array.length;
        int [] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[i] = array[i];
            result[i+n] = array[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] n = {1,2,1};
        System.out.println(Arrays.toString(concat(n)));
    }
}