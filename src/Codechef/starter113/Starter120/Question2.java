package Codechef.starter113.Starter120;
import java.util.Scanner;
public class Question2 {
    public static void main(String... args){
        var sc = new Scanner(System.in);
        var t = sc.nextInt();
        while(t --> 0){
            var X = sc.nextInt();
            if (canPlanGifts(X)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    private static boolean canPlanGifts(int budget) {
        var bool = false;
        var min = 127;
        if(min <= budget){
            bool = true;
        }else{
            bool = false;
        }
        return bool;
    }
}
