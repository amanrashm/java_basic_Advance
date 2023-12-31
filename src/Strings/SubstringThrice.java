package Strings;
public class SubstringThrice {
    public static int maximumLength(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length();i++){
            if(s.indexOf(i) == s.indexOf(i+1)){
                count++;
            }
            if(count < 1)
                return -1;
        }
        return count;
    }
    public static void main(String[] args) {
        var s = "aaaa";
        System.out.println(maximumLength(s));
    }
}