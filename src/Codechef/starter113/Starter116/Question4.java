package Codechef.starter113.Starter116;
import java.util.Scanner;
import java.util.Arrays;
public class Question4 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                for (int j = a.length - 1; j > b[i]; j--){
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }
}