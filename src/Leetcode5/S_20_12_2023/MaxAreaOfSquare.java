package Leetcode5.S_20_12_2023;

public class MaxAreaOfSquare {
    public static long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long maxArea = 0;
        for (int i = 0; i < bottomLeft.length; i++) {
            for (int j = i + 1; j < topRight.length; j++) {
                int x1 = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                int y1 = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                int x2 = Math.min(topRight[i][0], topRight[j][0]);
                int y2 = Math.min(topRight[i][1], topRight[j][1]);
                if (x1 < x2 && y1 < y2) {
                    long sideLength = Math.min(x2 - x1, y2 - y1);
                    long area = sideLength * sideLength;
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        var bottomLeft = new int [][]{{1,1},{2,2},{3,1}};
        var topRight = new int [][]{{3,3},{4,4},{6,6}};
        System.out.println(largestSquareArea(bottomLeft, topRight));
    }
}
