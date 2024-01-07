package basic_java;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        var invertedNumber = 0;
        if(x < 0 | (x % 10 == 0 & x != 0)) return false;
        while (x > invertedNumber){
            invertedNumber = invertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == invertedNumber || x == invertedNumber / 10;
    }
    public static void main(String[] args) {
        var x = 10;
        System.out.println(isPalindrome(x));
    }
}