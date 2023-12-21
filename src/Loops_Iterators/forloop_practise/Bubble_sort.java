package Loops_Iterators.forloop_practise;
import java.util.Arrays;
public class Bubble_sort {
    public static int[] bubblesort (int [] arrays){
        int n = arrays.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arrays[j] > arrays[j+1]){
                    arrays[j] = arrays[j] ^ arrays[j+1];
                    arrays[j+1] = arrays[j] ^ arrays[j+1];
                    arrays[j] = arrays[j] ^ arrays[j+1];
                }
            }
        }
        return arrays;
    }
    public static void main(String[] args) {
        int [] n = {5,3,6,9,1,0};
        System.out.print(Arrays.toString(bubblesort(n)));
    }
}