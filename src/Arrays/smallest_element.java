package Arrays;

public class smallest_element {
    public static int smallest(int [] arrays){
        int smallest = arrays[0];
        int n = arrays.length;
        for (int i = 1; i < n; i++) {
            if(smallest > arrays[i]){
                smallest = arrays[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int [] n = {10,20,1,30,3,40,4};
        System.out.println(smallest(n));
    }
}