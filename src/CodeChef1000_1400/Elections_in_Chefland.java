package CodeChef1000_1400;
import java.util.Scanner;
public class Elections_in_Chefland {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int max = Math.max(A, Math.max(B, C));
            if(max == A && A > 50){
                System.out.println("A");
            } else if(max == B && B > 50){
                System.out.println("B");
            } else if(max == C && C > 50){
                System.out.println("C");
            } else{
                System.out.println("NOTA");
            }
        }
    }
}