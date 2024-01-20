package CodeChef1000_1400;
import java.util.Scanner;
public class Easy_Pronunciation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();     //size of string
            sc.nextLine();
            String s=sc.next();     //string input
            s.toLowerCase();
            if(n<4){ System.out.println("YES"); }
            else{
                int count=0;
                for(int i=0; i<s.length(); i++){
                    if(count==4){ break; }
                    if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
                    { count=0; }
                    else { count++; }
                }
                if(count==4){ System.out.println("NO"); }
                else{ System.out.println("YES"); }
            }
        }
    }
}