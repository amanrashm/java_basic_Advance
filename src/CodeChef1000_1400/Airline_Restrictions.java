package CodeChef1000_1400;
public class Airline_Restrictions {
    public static void main(String... args){
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while(t-- > 0) {
            var a = sc.nextInt();
            var b = sc.nextInt();
            var c = sc.nextInt();
            var d = sc.nextInt();
            var e = sc.nextInt();
            if(a + b <= d && c <= e) {
                System.out.println("YES");
            } else if(a + c <= d && b <= e) {
                System.out.println("YES");
            } else if(b + c <= d && a <= e) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}