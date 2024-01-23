package CodeChef1000_1400;
public class OddPairs {
    public static void main(String... args) {
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while(t --> 0){
            var n = sc.nextLong();
            System.out.println(n * n / 2);
        }
    }
}