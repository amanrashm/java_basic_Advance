package Arrays;
public class Max_sum_subarray {
    public static int Max_sum_subarray(int [] array){
        int maxSum = 0;
        int currentSum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            currentSum += array[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if (currentSum < 0) currentSum = 0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] n = {5,-4,-2,6,-1};
        System.out.println(Max_sum_subarray(n));
    }
}