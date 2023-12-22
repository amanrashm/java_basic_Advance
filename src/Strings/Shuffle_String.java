package Strings;
public class Shuffle_String {
    public static String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int target = indices[i];
            ch[target] = s.charAt(i);
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet" , indices));
    }
}