package CodeChef1000_1400;
public class Mask_Policy {
    public static void main(String... args){
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while(t-- > 0) {
            var totalPeople = sc.nextInt();
            var infectedPeople = sc.nextInt();
            var nonInfectedPeople = totalPeople - infectedPeople;
            System.out.println(Math.min(infectedPeople, nonInfectedPeople));
        }
    }
}