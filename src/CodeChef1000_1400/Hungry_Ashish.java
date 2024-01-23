package CodeChef1000_1400;
public class Hungry_Ashish {
    public static void main(String... args) {
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while (t-- > 0) {
            var x = sc.nextInt();
            var y = sc.nextInt();
            var z = sc.nextInt();
            if(x >= y )
                System.out.println("PIZZA");
            else if(x >= z)
                System.out.println("BURGER");
            else
                System.out.println("NOTHING");
        }
    }
}