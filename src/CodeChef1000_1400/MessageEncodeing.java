package CodeChef1000_1400;
import java.util.Scanner;
public class MessageEncodeing {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            String s = sc.next();
            char[] c = s.toCharArray();
            for(int j=0; j<n-1; j=j+2){
                char d = c[j];
                c[j] = c[j+1];
                c[j+1] = d;
            }
            for(int j=0; j<n; j++){
                c[j] = (char)(219 - (int)c[j]);
                System.out.print(c[j] + "");
            }
            System.out.println();
        }
    }
}