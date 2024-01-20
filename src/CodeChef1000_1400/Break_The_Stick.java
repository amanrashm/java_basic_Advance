package CodeChef1000_1400;
import java.util.Scanner;
public class Break_The_Stick {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            System.out.println((n & 1) == 0 ? "YES" : x % 2 == 0 ? "NO" : "YES");
        }
    }
}