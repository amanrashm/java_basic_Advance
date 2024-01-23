package Arrays.matrix;
public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        var sum = 0;
        var n = mat.length;
        for (var i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
    public static void main(String[] args) {
        var mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        var res = diagonalSum(mat);
        System.out.println(res);
    }
}