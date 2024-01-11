package Codechef.starter113.Starter116;
import java.util.Scanner;
public class Question3 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            String s = sc.next();
            int value = 0;
            boolean hasAccess = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0')
                    value -= 1;
                else value = x;
                if (value < 0) {
                    hasAccess = false;
                    break;
                }
            }
            System.out.println(hasAccess ? "YES" : "NO");
        }
    }
}