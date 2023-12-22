package Strings;
public class Reverse_String2 {
    public static void main(String[] args) {
        String arr = "Aman@#$%^&*()fghjkhjghj0987654";
        System.out.println(reverse(arr));
    }
    private static String reverse(String arr) {
        String str = "";
        for (int i = arr.length()-1; i >= 0; i--) str += arr.charAt(i);
        return str.toString();
    }
}