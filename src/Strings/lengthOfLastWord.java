package Strings;
public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        var count = 0;
        var i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
    public static void main(String [] args){
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}