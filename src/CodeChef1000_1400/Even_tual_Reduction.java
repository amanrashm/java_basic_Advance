package CodeChef1000_1400;
import java.util.Scanner;
public class Even_tual_Reduction {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int N = sc.nextInt();
            String s = sc.next();
            int[] count = new int[26];
            for(int i=0; i<N; i++){
                count[s.charAt(i) - 'a']++;
            }
            boolean possible = true;
            for(int i=0; i<26; i++){
                if(count[i] % 2 != 0){
                    possible = false;
                    break;
                }
            }
            if(possible){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}