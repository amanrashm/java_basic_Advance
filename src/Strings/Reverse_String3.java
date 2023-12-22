package Strings;
public class Reverse_String3 {
    public static void main(String[] args) {
        String arr = "Aman@#$%^&*()fghjkhjghj0987654";
        System.out.println(reverse(arr));
    }
    private static String reverse(String arr) {
        StringBuffer SB = new StringBuffer();
        for (int i = arr.length()-1; i >= 0; i--) SB.append(arr.charAt(i));
        return SB.toString();
    }
}