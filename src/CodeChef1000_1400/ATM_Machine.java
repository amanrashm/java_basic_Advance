package CodeChef1000_1400;
import java.util.Scanner;
public class ATM_Machine {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here  total of K units of money
        // N people (numbered 1 through N) want to withdraw money
        // withdraw A units of money.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int [] A = new int[N];
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }
            for(int i = 0; i < N; i++){
                if(K >= A[i]){
                    System.out.print("1");
                    K = K - A[i];
                }
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
