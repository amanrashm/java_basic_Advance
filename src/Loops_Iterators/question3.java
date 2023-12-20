package Loops_Iterators;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(maxScore(a));
        }
    }
    public static int maxScore(int[] a) {
        int n = a.length;
        int max = 0;
        for (int i = 0; i < n; i += 2) {
            int xor = a[i] ^ a[i + 1];
            int bitCount = Integer.bitCount(xor);
            max += bitCount;
        }
        return max;
    }
}