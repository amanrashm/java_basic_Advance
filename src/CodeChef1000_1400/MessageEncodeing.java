package CodeChef1000_1400;
import java.util.Scanner;
public class MessageEncodeing {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            char [] arr = s.toCharArray();
            for(int i = 0; i < n-1; i += 2){
                arr[i] = (char) (arr[i] ^ arr[i+1]);
                arr[i+1] = (char) (arr[i] ^ arr[i+1]);
                arr[i] = (char) (arr[i] ^ arr[i+1]);
                if(s.length() % 2 == 0) {
                    if (arr[i] >= 'a' && arr[i] <= 'm') {
                        System.out.print(swap(arr[i]));
                        System.out.print(swap(arr[i + 1]));
                    } else if (arr[i] >= 'n' && arr[i] <= 'z') {
                        System.out.print(swap(arr[i]));
                        System.out.print(swap(arr[i + 1]));
                    }
                }
                else {
                    if (arr[i] >= 'a' && arr[i] <= 'm') {
                        System.out.print(swap(arr[i]));
                        System.out.print(swap(arr[i + 1]));
                    } else if (arr[i] >= 'n' && arr[i] <= 'z') {
                        System.out.print(swap(arr[i]));
                        System.out.print(swap(arr[i + 1]));
                        if(arr.length - 1 == arr[i])
                            System.out.print(swap(arr[i + 2]));
                    }
                }
            }break;
        }
    }
    //method to swap characters in reverse order of alphabet example a -> z, b -> y, c -> x, etc.
    public static char swap(char c){
        return (char)('z' - (c - 'a'));
    }
}