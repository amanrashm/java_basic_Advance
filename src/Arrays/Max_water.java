package Arrays;
public class Max_water {
    public static int maxArea(int[] height) {
        int heights = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int width = right-left;
            heights = Math.max(heights, Math.min(height[left], height[right]) * width);
            if(height[left] <= height[right]){
                left++;
            }else right--;
        }
        return heights;
    }
    public static void main(String[] args) {
        int [] height = {4,2,10,6,8,2,6,2};
        int [] height1 = {1,8,6,2,5,4,8,3,7};
        int [] height2 = {1,1};
        System.out.println(maxArea(height));
        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));
    }
}