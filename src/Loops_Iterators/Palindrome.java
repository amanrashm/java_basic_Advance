package Loops_Iterators;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x < 0 | (x % 10 == 0 & x != 0)){
            return false;
        }
        int invertedNumber = 0;
        while (x > invertedNumber){
            invertedNumber = invertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == invertedNumber || x == invertedNumber / 10;
    }
    public static void main(String[] args) {
        int x = 123;
        System.out.println(isPalindrome(x));
    }
}