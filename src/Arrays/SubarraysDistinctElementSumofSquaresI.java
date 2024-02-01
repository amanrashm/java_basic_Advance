package Arrays;
import java.util.*;
public class SubarraysDistinctElementSumofSquaresI {
    public static int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            int count = 0;
            Set<Integer> set = new HashSet<>();
            for(int j = i; j < nums.size(); j++){
                if(!set.contains(nums.get(j))){
                    set.add(nums.get(j));
                    count++;
                }
                sum += count * count;
            }
        }
        return sum;
    }
    public static void main(String... args){
        var nums = Arrays.asList(1,2,1);
        System.out.println(sumCounts(nums));
    }
}