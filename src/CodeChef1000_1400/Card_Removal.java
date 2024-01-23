package CodeChef1000_1400;
import java.util.Scanner;
import java.util.Arrays;
public class Card_Removal {
    //TODO: This is not working
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int [] A = new int[N];
            for(int i=0; i<N; i++){
                int remove = sc.nextInt();
                A[i] = remove;
            }
            Arrays.sort(A);
            int count = 1;
            int max = 0;
            for(int i=0; i<N-1; i++){
                if(A[i] == A[i+1]){
                    count += 1;
                } else{
                    if(count > max){
                        max = count;
                    }
                    count = 1;
                }
            }
            if(count > max){
                max = count;
            }
            System.out.println(N - max);
        }
    }
}