package Codechef.starter113.Starter116;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            String d = sc.next();
            String e = sc.next();
            String f = sc.next();
            System.out.println((a.equals("W") && b.equals("W") && c.equals("W")) ||
                    (b.equals("W") && c.equals("W") && d.equals("W")) ||
                    (c.equals("W") && d.equals("W") && e.equals("W")) ||
                    (d.equals("W") && e.equals("W") && f.equals("W")) ? "YES" : "NO");
        }
    }
}