package Arrays.matrix;

import java.util.Arrays;
import java.util.Comparator;

public class Find_Max_Distance_from_Origin {
    public static int maxDistanceFromORigin(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int d1 = a[0] * a[0] + a[1] * a[1];
                int d2 = b[0] * b[0] + b[1] * b[1];
                if (d1 == d2) {
                    return a[0] - b[0];
                }
                return d1 - d2;
            }
        });
        int max = 0;
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
            max = Math.max(max, a[0] * a[0] + a[1] * a[1]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {{-2,10},{2,10},{3,-6},{7,18}};
        System.out.println(maxDistanceFromORigin(arr));
    }
}