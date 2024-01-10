package Arrays;
public class Max_Water__Container {
    public static int maxArea(int[] height) {
        var maxArea = 0; var minHeight = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, (right - left) * minHeight);
            while (left < right && height[left] <= minHeight)
                left++;
            while (left < right && height[right] <= minHeight)
                right--;
        }
        return maxArea;
    }
    public static void main(String... args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}