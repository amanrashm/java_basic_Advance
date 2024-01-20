package Arrays;
import java.util.Arrays;
public class Widest_Vertical_Area_Between_twoPoints {
    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] Sorted = Arrays.stream(points).mapToInt(point -> point[0]).sorted().toArray();
        int maxWidth = 0;
        for (int i = 0; i < Sorted.length - 1; i++) maxWidth = Math.max(maxWidth, Sorted[i + 1] - Sorted[i]);
        return maxWidth;
    }
    public static void main(String[] args) {
        var points = new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        System.out.println(maxWidthOfVerticalArea(points));
    }
}
