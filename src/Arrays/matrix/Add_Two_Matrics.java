package Arrays.matrix;
public class Add_Two_Matrics {
    public static int [][] addTwoMatrics(int [][] mat1, int [][] mat2){
        var result = new int[mat1.length][mat1[0].length];
        for(var i = 0; i < mat1.length; i++){
            for(var j = 0; j < mat1[0].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [][] mat1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] mat2 = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        var result = addTwoMatrics(mat1, mat2);
        for (int[] ints : result) {
            for (var j = 0; j < result[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}