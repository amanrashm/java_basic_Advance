package Arrays.matrix;

import java.util.Arrays;
import java.util.Comparator;

/*
Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
*/
public class Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        int length = intervals.length;
        if (length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int a = 1;
        int b = 0;
        int[][] mergedIntervals = new int[length][2];
        int mergedIntervalIndex = 0;
        mergedIntervals[mergedIntervalIndex][b] = intervals[0][b];
        mergedIntervals[mergedIntervalIndex][a] = intervals[0][a];
        for (int i = 1; i < length; i++) {
            if (intervals[i][b] <= mergedIntervals[mergedIntervalIndex][a]) {
                mergedIntervals[mergedIntervalIndex][a] = Math.max(mergedIntervals[mergedIntervalIndex][a], intervals[i][a]);
            } else {
                mergedIntervalIndex++;
                mergedIntervals[mergedIntervalIndex][b] = intervals[i][b];
                mergedIntervals[mergedIntervalIndex][a] = intervals[i][a];
            }
        }
        int[][] result = new int[mergedIntervalIndex + 1][2];
        System.arraycopy(mergedIntervals, 0, result, 0, mergedIntervalIndex + 1);

        return result;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval));
        }
    }
}