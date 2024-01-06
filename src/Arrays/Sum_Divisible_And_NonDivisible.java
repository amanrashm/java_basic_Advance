package Arrays;
public class Sum_Divisible_And_NonDivisible {
    public static int differenceOfSums(int n, int m) {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        return sum2 - sum1;
    }
    public static void main(String[] args) {
        int n = 10, m = 3;
        System.out.println(differenceOfSums(n, m));
    }
}