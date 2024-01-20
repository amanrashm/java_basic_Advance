package Arrays;

public class Trapping_Rain_water {
    public static int trap(int[] height) {
        var left = 0;
        var right = height.length-1;
        var leftMax = 0;
        var rightMax = 0;
        var ans = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }else{
                    ans += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    ans += rightMax - height[right];
                }
                right--;
            }
        }
        return ans;
    }
    public static void main(String... args) {
        var height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
