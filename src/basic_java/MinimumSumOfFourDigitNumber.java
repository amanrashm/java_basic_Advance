package basic_java;
import java.util.Arrays;
public class MinimumSumOfFourDigitNumber {
    public static int minSumOfPair(int num){
        var result = new int[4];
        var i = 0;
        while(num > 0){
            result[i] = num % 10;
            num /= 10;
            i++;
        }
        Arrays.parallelSort(result);
        return (result[0] * 10 + result[2]) + (result[1] * 10 + result[3]);
    }
    public static void main(String[] args) {
        //Some possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
        int num = 2932;
        System.out.println(minSumOfPair(num));
    }
}