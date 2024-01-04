package Arrays;
import java.util.Arrays;
import java.util.List;
public class Sum_Values_At_Indices_K_Set_Bits {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        var sum=0;
        var i=0;
        while (i<nums.size()) {
            var count = 0;
            count= binary(i);
            if(count==k){
                sum+=nums.get(i);
            }
            i++;
        }
        return sum;
    }
    public static int binary(int n){
        var count=0;
        while(n >0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        var list = Arrays.asList(5,10,1,5,2);
        var k = 1;
        System.out.println(sumIndicesWithKSetBits(list, k));
    }
}
