package Arrays;
import java.util.Arrays;
public class Largest_element {
    public static int largest(int [] arrays){
        int largest = arrays[0];
        int n = arrays.length;
        for (int i = 1; i < n; i+=3)
            if(largest < arrays[i])
                largest = arrays[i];
            else if(largest < arrays[i+1])
                largest = arrays[i+1];
            else if(largest < arrays[i+2])
                largest = arrays[i+2];
        return largest;
    }
    public static void main(String[] args) {
        int [] n = {10,20,1,30,3,40,4};
        System.out.println(largest(n));
    }
}
/*int largest = arrays[0];
        int n = arrays.length;
        /*for (int i = 1; i < n; i++) {
            if(largest < arrays[i]){
                largest = arrays[i];
            }

        Arrays.sort(arrays);
        /*largest = arrays[arrays.length-1];
        return largest;
                return arrays[arrays.length-1];*/