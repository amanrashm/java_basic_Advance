package Arrays;
public class minTimeVisitingAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        var  minTime = Long.MAX_VALUE;
        for(var i = 0; i < points.length-1; i++){
            var time = 0;
            for(var j = 0; j < points.length-1; j++){
                var x1 = points[j][0];
                var y1 = points[j][1];
                var x2 = points[j+1][0];
                var y2 = points[j+1][1];
                var xDiff = Math.abs(x1 - x2);
                var yDiff = Math.abs(y1 - y2);
                time += Math.max(xDiff, yDiff);
            }
            minTime = Math.min(minTime, time);
        }
        return (int) minTime;
    }
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
}
// TODO: 1. Find the time to travel from one point to another
//       2. Find the minimum time to travel from one point to another
//       3. Return the minimum time
//       4. Time Complexity: O(n^2)
//       5. Space Complexity: O(1)
//       6. Runtime: 1 ms, faster than 46.86% of Java online submissions for Minimum Time Visiting All Points.
//       7. Memory Usage: 38.7 MB, less than 100.00% of Java online submissions for Minimum Time Visiting All Points.
//       8.UNDERSTAND THIS LOGIC BELOW
/*public int toTime(int[] from, int[] to) {
        int xDiff = Math.abs(from[0] - to[0]);
        int yDiff = Math.abs(from[1] - to[1]);

        return Math.max(xDiff, yDiff);
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 1; i < points.length; i++) {
            time += toTime(points[i - 1], points[i]);
        }

        return time;
    }*/