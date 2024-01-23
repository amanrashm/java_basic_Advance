package CodeChef1000_1400;
public class PrimeReversal {
    public static void main(String... args) {
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while(t--> 0) {
            var n = sc.nextInt();
            for(var i = 1; i < n; ++i) {
                var a = sc.next();
                var b = sc.next();
                var aInt = Integer.parseInt(a);
                var bInt = Integer.parseInt(b);
                var a1 = Integer.parseInt(new StringBuilder(aInt + "").reverse().toString());
                var b1 = Integer.parseInt(new StringBuilder(bInt + "").reverse().toString());
                if(isPrime(a1) && isPrime(b1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
    private static boolean isPrime(int a) {
        if(a == 1) return false;
        for(var i = 2; i <= Math.sqrt(a); ++i) {
            if(a % i == 0) return false;
        }
        return true;
    }
}