package Arrays.matrix;
import java.util.Arrays;
public class Count_Negatives {
    public static int Count_Negatives(int [][] grid){
        /*int count = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] < 0) {
                    count++;
                }
            }
        }
        return count;*/
        int count = 0;
        for (int[] ints : grid) {
            count += (int) Arrays.stream(ints).filter(i -> i < 0).count();
        }
        return count;
    }
    public static void main(String[] args) {
        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(Count_Negatives(grid));
    }
}