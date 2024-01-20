package Strings;
public class ReverseWords {
    public static String reverseWords(String s) {
        /*var str = s.split(" ");
        var arr = new String[str.length];
        for (var i = 0; i < str.length; i++) {
            var word = str[i];
            var sb = new StringBuilder();
            for (var j = word.length() - 1; j >= 0; j--) {
                sb.append(word.charAt(j));
            }
            arr[i] = sb.toString();
        }
        return String.join(" ", arr);*/
        //Two Pointer Approach
        var arr = s.toCharArray();
        var start = 0;
        for (var end = 0; end < arr.length; end++) {
            if (arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        reverse(arr, start, arr.length - 1);
        return new String(arr);
    }
    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            arr[start] = (char) (arr[start] ^ arr[end]);
            arr[end] = (char) (arr[start] ^ arr[end]);
            arr[start] = (char) (arr[start] ^ arr[end]);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        var s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}