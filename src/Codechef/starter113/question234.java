package Codechef.starter113;
import java.util.*;
import java.util.stream.IntStream;
public class question234{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var T = sc.nextInt();
        while (T --> 0) {
            var N = sc.nextInt();
            var A = IntStream.range(0, N).mapToObj(i -> sc.nextInt()).toArray(Integer[]::new);
            var B = IntStream.range(0, N).mapToObj(i -> sc.nextInt()).toArray(Integer[]::new);
            Arrays.sort(A);
            Arrays.sort(B,Collections.reverseOrder());
            var c = 0;
            for (var i = 0; i < N-1; i++) {
                if(A[i]+B[i] != A[i+1]+B[i+1]){
                    System.out.println(-1);
                    c = 1;
                    break;
                }
            }
            if(c == 0){
                Arrays.stream(A, 0, N).forEach(System.out::println);
                Arrays.stream(B, 0, N).forEach(System.out::println);
            }
        }
    }
}