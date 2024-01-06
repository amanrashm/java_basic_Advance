package Loops_Iterators.WhileLoop_practise;
public class SQrt {
    public static int mySqrt(int x){
        if(x == 0) return 0;
        /*var X = Math.sqrt(x);
        return (int) X;*/
        var left = 1; var right = x;
        while(left < right){
            var mid = left + (right - left) / 2;
            if(mid <= x / mid && (mid + 1) > x / (mid + 1)) return mid;
            else if(mid > x / mid) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
}