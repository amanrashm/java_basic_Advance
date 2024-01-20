package Arrays.matrix;

public class LargestLocalValuesInMatrix {
    public int[][] largestLocal(int[][] grid) {
        var row = grid.length;
        var col = grid[0].length;
        var ans = new int[row][col];
        for(var i=0; i<row; i++){
            for(var j=0; j<col; j++){
                var max = grid[i][j];
                if(i-1>=0) max = Math.max(max, grid[i-1][j]);
                if(i+1<row) max = Math.max(max, grid[i+1][j]);
                if(j-1>=0) max = Math.max(max, grid[i][j-1]);
                if(j+1<col) max = Math.max(max, grid[i][j+1]);
                ans[i][j] = max;
            }
        }
        return ans;
    }
}
