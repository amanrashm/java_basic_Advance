package Strings;
public class Substring_Extraction {
    public static void substring(String str){
        int n = str.length();
        for (int i = 0; i <= n; i++) {
            for (int j = i+1; j <= n; j++) System.out.println(str.substring(i, j));
        }
    }
    public static void main(String[] args) {
        String arr = "abc";
        substring(arr);
    }
}