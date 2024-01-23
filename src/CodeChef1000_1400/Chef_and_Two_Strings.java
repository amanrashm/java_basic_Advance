package CodeChef1000_1400;
import java.util.Scanner;
public class Chef_and_Two_Strings {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != '?' && s2.charAt(i) != '?' && s1.charAt(i) != s2.charAt(i)) {
                    count++;
                }
            }
            int count2 = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == '?' || s2.charAt(i) == '?') {
                    count2++;
                }
            }
            System.out.println(count + " " + (count + count2));
        }
    }
}