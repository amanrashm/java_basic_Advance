package Strings;
public class Binary_String {
    public static void main(String[] args) {
        String str = "111";
        System.out.println(binary(str));
    }
    private static int binary(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return ( count * (count - 1))/2 ;
    }
}