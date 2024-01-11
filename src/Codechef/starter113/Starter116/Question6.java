package Codechef.starter113.Starter116;
import java.util.Arrays;
import java.util.Scanner;
public class Question6 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), x = sc.nextInt(), z = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int sum = 0, count = 0;
            for(int i = 0; i < n; i++){
                sum += arr[i];
                if(sum <= z)
                    count++;
                else
                    break;
            }
            if(count == n)
                System.out.println(-1);
            else
                System.out.println(count);
        }
    }
}