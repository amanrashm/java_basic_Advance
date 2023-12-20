package Codechef.starter113;
import java.util.Scanner;
public class question2 {
    public static boolean MakeZero(int N) {
        if (N < 0)
            return false;
        if (N == 0)
            return true;
        return MakeZero(N - 3) || MakeZero(N - 4);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (MakeZero(N)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}