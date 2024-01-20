package CodeChef1000_1400;
import java.util.Scanner;
public class AdjacentSumParity {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0) {
            int n=sc.nextInt();
            int[] binarray =new int[n];
            int i,count=0;
            for(i=0;i< binarray.length;i++)
            {
                binarray[i]=sc.nextInt();
                if(binarray[i]==1)
                    count++;
            }
            if((count & 1) ==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}