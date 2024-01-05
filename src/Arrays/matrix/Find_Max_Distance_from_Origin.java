package Arrays.matrix;

import java.util.Arrays;
import java.util.Comparator;

public class Find_Max_Distance_from_Origin {
    //int arr[][] = {{-2,10},{2,10},{3,-6},{7,18}};
    //Sort this 2D array based on the distance from origin using cartesian distance formula
    // every element consist of x-axis and Y-axis value. if Distance is same then sort based on x-axis value.
    //sort using Comparator / comparable
    public static int maxDistanceFromORigin(int [][] arr){
        //finding distance of each element from origin d=√((x1-x2)2+(y1-y2)2) and sorting based on distance
        // and pass max distance into max variable
            Arrays.parallelSort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                var d1 = (int) Math.pow(o1[0]-o2[0],2);
                var d2 = (int) Math.sqrt(Math.pow(o1[1],2)+Math.pow(o2[1],2));
                var d = Math.sqrt(d1+d2);
                return (int) d;
            }
        });
        return (int) Math.sqrt(Math.pow(arr[arr.length-1][0],2)+Math.pow(arr[arr.length-1][1],2));
    }
    public static void main(String[] args) {
        int[][] arr = {{-2,10},{2,10},{3,-6},{7,18}};
        System.out.println(maxDistanceFromORigin(arr));
    }
}