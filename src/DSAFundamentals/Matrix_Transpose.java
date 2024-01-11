package DSAFundamentals;
public class Matrix_Transpose {
    public static void transPose(int[][] arr) {
        for (var i = 0; i < arr.length; i++)
            for (var j = i; j < arr[0].length; j++) {
                var temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
    }
    public static void main(String[] args) {
        var arr = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10 ,11, 12}, {13, 14, 15, 16}};
        System.out.println("Before transpose:");
        for (var i = 0; i < arr.length; i++) {
            for (var j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("After transpose:");
        transPose(arr);
        for (var i = 0; i < arr.length; i++) {
            for (var j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}