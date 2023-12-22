package Strings;
public class escape_Character {
    public static void main(String[] args) {
        String arr = "Aman@#$%^&*()fghjkhjghj0987654";
        System.out.println(escape(arr));
    }
    private static String escape(String arr) {
        return arr.replaceAll("[^a-zA-Z0-9]","");
    }
}