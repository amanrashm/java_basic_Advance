package Arrays;
import java.util.Scanner;
public class Decimal_Binary {
    public static int binary(int n){
        var bit = 0;
        int i = 0;
        while(n != 0){
            var bits = n & 1;
            bit = (int) (bits * Math.pow(10, i) + bit);
            n >>= 1;
            i++;
        }
        return bit;
    }
    public static int decimal(int n){
        var bit = 0;
        var i = 0;
        while(n != 0){
            var bits = n % 10;
            bit = bit + (bits * (int) Math.pow(2, i));
            n /= 10;
            i++;
        }
        return bit;
    }
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Give an integer value to convert into binary representation :- ");
        var n = sc.nextInt();
        System.out.println("Binary representation for given number "+n+" is :- "+binary(n));
        System.out.print("Give an binary value to convert into decimal representation :- ");
        var n1 = sc.nextInt();
        System.out.println("decimal representation for binary number "+n1+" is :- "+decimal(n1));
    }
}