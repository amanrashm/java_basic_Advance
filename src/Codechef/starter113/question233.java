package Codechef.starter113;
import java.util.Scanner;
public class question233 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var T= sc.nextInt();
        while (T-->0){
            var N= sc.nextInt();
            var X= sc.nextInt();
            var Y= sc.nextInt();
            var small = Y/3;
            var large = X-small;
            if(N > X) System.out.println("NO");
            else if((large/2) + small >= N) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
/*You are decorating your Christmas Tree and want to make it beautiful.
You consider a Christmas tree beautiful when each leaf of the Christmas Tree is decorated with either one of the following :

1 large ornament and 3 small ornaments.
2 large ornaments.
You have X large ornaments and Y small ornaments. Your Christmas tree consists of
N leaves. Determine if you can make the Christmas tree beautiful by decorating each leaf with either one of the above requirements.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of three space-separated integers,
N,X and Y, the number of leaves, the number of large ornaments and the number of small ornaments.
Output Format
For each test case, output on a new line, YES if it is possible to make the Christmas tree beautiful, else NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).
Constraints
1≤T≤10^4
1≤N,X,Y≤10^8
*/