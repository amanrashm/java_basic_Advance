package Strings;
public class Palidrome {
    public static boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(checkIfPalindrome(s));
    }
}
// explanation in written step by step:
// 1. create a method that takes a string as a parameter
// 2. create two variables, left and right, and set them to 0 and the length of the string - 1
// 3. create awhile loop that runs while left is less than right
// 4. create an if statement that checks if the character at the left index is not equal to the character at the right index
// 5. if the if statement is true, return false
// 6. increment left and decrement right
// 7. return true