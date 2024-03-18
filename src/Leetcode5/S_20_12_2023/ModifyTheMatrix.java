package Leetcode5.S_20_12_2023;
public class ModifyTheMatrix {
    public static int[][] modifiedMatrix(int[][] matrix) {
        var m = matrix.length;
        var n = matrix[0].length;
        var answer = new int[m][n];
        for (var i = 0; i < m; i++) {
            System.arraycopy(matrix[i], 0, answer[i], 0, n);
        }
        for (var j = 0; j < n; j++) {
            var maxInColumn = Integer.MIN_VALUE;
            for (var i = 0; i < m; i++) {
                if (matrix[i][j] != -1) {
                    maxInColumn = Math.max(maxInColumn, matrix[i][j]);
                }
            }
            for (var i = 0; i < m; i++) {
                if (matrix[i][j] == -1) {
                    answer[i][j] = maxInColumn;
                }
            }
        }
        return answer;
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (var value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String... args) {
        var maxReplaceMatrix = new ModifyTheMatrix();
        // Example 1
        var matrix1 = new int[][]{{1, 2, -1}, {4, -1, 6}, {7, 8, 9}};
        var result1 = maxReplaceMatrix.modifiedMatrix(matrix1);
        printMatrix(result1);
        // Example 2
        var matrix2 = new int[][]{{3, -1}, {5, 2}};
        var result2 = maxReplaceMatrix.modifiedMatrix(matrix2);
        printMatrix(result2);
    }
}