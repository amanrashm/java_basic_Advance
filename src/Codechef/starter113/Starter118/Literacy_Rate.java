package Codechef.starter113.Starter118;
public class Literacy_Rate {
    public static void main(String... args){
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while(t --> 0) {
            var P = sc.nextDouble();
            var L = sc.nextDouble();
             percentage(P, L);
        }
    }
    public static void percentage(double P, double L){
        var percentage = L / P * 100.0;
        if(percentage >= 75.0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}