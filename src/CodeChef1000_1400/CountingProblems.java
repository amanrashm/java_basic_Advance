package CodeChef1000_1400;
public class CountingProblems {
    // TODO: 23/01/2024
    public static void main(String... args){
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while(t --> 0){
            var n = sc.nextInt();
            for(int i = 0; i < n; i++){
                var A = new int[n];
                if((A.length & 1) != 0){
                    System.out.println("NO");
                    continue;
                }
                var s1 = new int[n / 2];
                var s2 = new int[n / 2];
                var sum1 = 0;
                var sum2 = 0;

                if(((sum1 * sum2) & 1) != 0){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}