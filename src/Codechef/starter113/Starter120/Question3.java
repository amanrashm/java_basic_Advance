package Codechef.starter113.Starter120;
import java.util.Scanner;
public class Question3 {
    public static void main(String... args){
        var sc = new Scanner(System.in);
        var T = sc.nextInt();
        while(T --> 0){
            var X = sc.nextInt(); // count of 0
            var Y = sc.nextInt(); // count of 1
            System.out.println(Y/(X-1));
        }
    }
}
