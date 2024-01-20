package Arrays;
public class SumOfOddSubArrays {
    public int sumOddLengthSubarrays(int[] arr) {
        var sum = 0;
        for(var i=0; i<arr.length; i++){
            var temp = 0;
            for(var j=i; j<arr.length; j++){
                temp += arr[j];
                if((j-i+1)%2!=0){
                    sum += temp;
                }
            }
        }
        return sum;
    }
    public static void main(String... args) {
        var arr = new int[]{1,4,2,5,3};
        var obj = new SumOfOddSubArrays();
        System.out.println(obj.sumOddLengthSubarrays(arr));
    }
}
/*TODO: learn this approach
int sum = 0,n = arr.length;
       for(int i = 0; i <arr.length;i++){
           int contri=(n-i)*(i+1);
           int oddlen = (contri+1)/2;
           sum+=arr[i]*oddlen;
       }
       return sum;*/