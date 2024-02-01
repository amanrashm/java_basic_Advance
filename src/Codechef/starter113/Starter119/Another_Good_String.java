package Codechef.starter113.Starter119;

public class Another_Good_String {
    public static void main(String... args){
        var sc = new java.util.Scanner(System.in);
        var T = sc.nextInt();
        while (T-- > 0){
            var N = sc.nextInt();
            var Q = sc.nextInt();
            var N1 = new String[N+Q];
            var Q1 = new String[Q];
            var count2 = new int[Q+1];
            var count = 0;
            for (var i = 0; i < N; i++) {
                N1[i] = sc.next();
                N1[i+1] = sc.next();
                if (N1[i] == N1[i+1]) {
                    count++;
                }
            }
        }
    }
}
