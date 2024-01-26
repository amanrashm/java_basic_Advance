package Codechef.starter113.Starter118;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSetGCD {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            subsetGCD(arr, K);
            System.out.println();
        }
    }

    private static void subsetGCD(int[] arr, int K) {
        int maxGCD = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < (1 << arr.length); i++) {
            List<Integer> temp = new ArrayList<>();
            int gcd = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) > 0) {
                    temp.add(arr[j]);
                    gcd = gcd(gcd, arr[j]);
                }
            }
            if (temp.size() == K && gcd > maxGCD) {
                maxGCD = gcd;
                result = temp;
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}