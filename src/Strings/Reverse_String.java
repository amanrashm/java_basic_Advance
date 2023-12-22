package Strings;
public class Reverse_String {
    public static void main(String[] args) {
        String arr = "Aman@#$%^&*()fghjkhjghj0987654";
        System.out.println(reverse(arr));
    }
    private static String reverse(String arr) {
        StringBuilder rev = new StringBuilder();
        for (int i = arr.length()-1; i >= 0; i--) rev.append(arr.charAt(i));
        return rev.toString();
    }
}