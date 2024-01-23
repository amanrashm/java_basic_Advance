package CodeChef1000_1400;
import java.util.Scanner;
public class Zero_String {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var t = sc.nextInt();
        while(t-- > 0) {
            var l = sc.nextInt();
            var binaryNum = sc.next();
            var zeros = 0;
            var ones = 0;
            for(var i = 0; i < l; ++i) {
                if(binaryNum.charAt(i) == '1')
                    ++ones;
                else ++zeros;
            }
            if(ones > zeros) {
                System.out.println(1 + zeros);
            } else {
                System.out.println(ones);
            }
        }
    }
}