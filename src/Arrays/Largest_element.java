package Arrays;

public class Largest_element {
    public static int largest(int [] arrays){
        int largest = arrays[0];
        int n = arrays.length;
        for (int i = 1; i < n; i++) {
            if(largest < arrays[i]){
                largest = arrays[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] n = {10,20,1,30,3,40,4};
        System.out.println(largest(n));
    }
}