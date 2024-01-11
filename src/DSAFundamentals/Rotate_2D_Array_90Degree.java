package DSAFundamentals;

public class Rotate_2D_Array_90Degree {
    public static void rotate(int[][] arr) {
        Matrix_Transpose.transPose(arr);
        for (var i = 0; i < arr.length; i++)
            for (var j = 0; j < arr[0].length/2; j++) {
                var temp = arr[i][j];
                arr[i][j] = arr[i][arr[0].length-1-j];
                arr[i][arr[0].length-1-j] = temp;
            }
    }
    public static void main(String[] args) {
        var arr = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10 ,11, 12}, {13, 14, 15, 16}};
        System.out.println("Before rotate:");
        for (var i = 0; i < arr.length; i++) {
            for (var j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("After rotate:");
        rotate(arr);
        for (var i = 0; i < arr.length; i++) {
            for (var j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}