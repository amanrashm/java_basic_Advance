package Codechef.starter113.Starter118;
public class JoinStates {
    public static void main(String... args){
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while(t --> 0) {
            var N = sc.nextInt();
            var M = sc.nextInt();// count should not be less than M
            var A = new int[N];
            for(var i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            System.out.println(maxStates(A, M));
        }
    }
    public static int maxStates(int[] A, int M){
        var count = 0;
        var sum = 0;
        for(var i = 0; i < A.length; i++) {
            sum += A[i];
            if(sum >= M) {
                count++;
                sum = 0;
            }
        }
        return count;
    }
}
