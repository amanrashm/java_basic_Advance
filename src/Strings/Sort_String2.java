package Strings;
import java.util.Arrays;
public class Sort_String2 {
    public static String sorted(String str){
        char [] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static void main(String[] args) {
        String arr = "Aman";
        System.out.println(sorted(arr));
    }
}