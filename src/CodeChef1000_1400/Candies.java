package CodeChef1000_1400;
import java.util.Arrays;
import java.util.Scanner;
public class Candies {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while (i < t) {
            int n =sc.nextInt();
            int [] a = new int [n*2];
            Arrays.setAll(a, j -> sc.nextInt());
            int count=0;
            int count2= 0;
            for (int value : a) {
                count = 0;
                for (int j : a) {
                    if (value == j) {
                        count++;
                    }
                }
                if (count > 2) {
                    System.out.println("No");
                    break;
                } else {
                    count2++;
                }
            }
            if(count2 ==a.length){
                System.out.println("Yes");
            }
            i++;
        }
    }
}