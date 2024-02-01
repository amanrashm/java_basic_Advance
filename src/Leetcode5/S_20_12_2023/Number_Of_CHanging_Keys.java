package Leetcode5.S_20_12_2023;
public class Number_Of_CHanging_Keys {
    public static int countKeyChanges(String s) {
        var count = 0;
        var len = s.length();
        for(var i = 0; i < len-1; i++) {
            var ch = s.charAt(i);
            String str = String.valueOf(ch);
            var ch2 = s.charAt(i+1);
            String str2 = String.valueOf(ch2);
            if(!(str.equalsIgnoreCase(str2))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String... args){
        var s = "aAbBcC";
        System.out.println(countKeyChanges(s));
    }
}