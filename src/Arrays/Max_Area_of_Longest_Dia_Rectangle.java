package Arrays;
/*Input: dimensions = [[9,3],[8,6]]
Output: 48
Explanation:
For index = 0, length = 9 and width = 3. Diagonal length = sqrt(9 * 9 + 3 * 3) = sqrt(90) ≈ 9.487.
For index = 1, length = 8 and width = 6. Diagonal length = sqrt(8 * 8 + 6 * 6) = sqrt(100) = 10.
So, the rectangle at index 1 has a greater diagonal length therefore we return area = 8 * 6 = 48.
int [][] dimensions = {{2,6},{5,1},{3,10},{8,4}}; o/p 30*/
public class Max_Area_of_Longest_Dia_Rectangle {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        var maxArea = 0;
        double Maxdiagonal = 0;
        for (int[] dimension : dimensions) {
            double diagonal = Math.sqrt((dimension[0] * dimension[0]) + (dimension[1] * dimension[1]));
            if (diagonal > Maxdiagonal) {
                Maxdiagonal = diagonal;
                maxArea = dimension[0] * dimension[1];
            } else {
                if (diagonal == Maxdiagonal) {
                    maxArea = Math.max(maxArea, dimension[0] * dimension[1]);
                }
            }
        }
        return maxArea;
    }
    public static void main(String [] args){
        int [][] dimensions = {{2,6},{5,1},{3,10},{8,4}};
        System.out.println(areaOfMaxDiagonal(dimensions));
    }
}
