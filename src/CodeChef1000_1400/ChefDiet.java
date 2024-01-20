package CodeChef1000_1400;
import java.util.Scanner;
public class ChefDiet {
    public static void main(String... args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] x = new int[n];
            for(int i=0;i<n;i++){
                x[i]=sc.nextInt();
            }
            boolean flag=true;
            int avail=0,index=0;
            for(int i=0;i<n;i++){
                avail=x[i]+avail;
                if(avail>=k){
                    avail=avail-k;
                }
                else{
                    index=i;
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO "+(index+1));
            }
        }
    }
}