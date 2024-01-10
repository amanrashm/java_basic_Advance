package Strings;
public class Split_String_In_Binary_String {
    public static int balancedStringSplit(String s) {
        var sum1 = 0;
        var sum2 = 0;
        var count = 0;
        for(int i = 0;i< s.length()-1;i+=2){
            if(s.charAt(i) == 'R') sum1++;
            if(s.charAt(i+1) == 'L') sum2++;
            if(sum1==sum2){
                count++;
                sum1=0;
                sum2=0;
            }
        }return count;
    }
    public static void main(String... args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}