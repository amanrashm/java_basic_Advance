package CodeChef1000_1400;
import java.util.Scanner;
public class Bear_And_Candies_123 {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            String winner = "";
            int i = 1;
            while(true)
            {
                if((i*i) > A)
                {
                    winner = "Bob";
                    break;
                }
                if(i*(i+1) > B)
                {
                    winner = "Limak";
                    break;
                }
                i+=1;
            } System.out.println(winner);
        }
    }
}