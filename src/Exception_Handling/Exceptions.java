package Exception_Handling;
import java.util.Arrays;
public class Exceptions {
    public static int[] exceptions(int i, int j){
        int [] k1 = {2,4,0,7};
        int n = k1.length;
        int [] k2 = new int[n*2+1];
        k2[0] = i / j;
        int a = 1;
        try {
            for(int k = 1; k < k2.length; k++){
                k2[a++] = k1[k]/i;
            }
            for(int k = 3; k < k2.length; k++){
                k2[a++] = k1[k]/j;
            }
        }catch (ArithmeticException ae){
            System.out.println("Dividing any number with 0 gives 0 always");
        }catch (IndexOutOfBoundsException ioobe){
            System.out.println("Be in the limit of iterations or the total number of input provided");
        }
        return k2 ;
    }
    public static void main(String[] args) {
        int i = 3; int j = 2;
        System.out.println(Arrays.toString(exceptions(i,j)));
    }
}