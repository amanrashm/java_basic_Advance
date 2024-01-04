package Codechef.starter113;

import java.util.Scanner;

public class question231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        if((chocolates & 1 )== 0 ) {
            System.out.print(chocolates / 2);
            System.out.println(chocolates);
        }
        else
        {
            System.out.println((chocolates/2)+1);
            System.out.println(chocolates);
        }
    }
}
