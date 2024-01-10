package Strings;
import java.util.*;
public class Generate_Parenthesis {
    public static List<String> generateParenthesis(int n) {
        var list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    private static void backtrack(ArrayList<String> list, String s, int left, int right, int n) {
        if (s.length() == n * 2) {
            list.add(s);

            return;
        }
        if (left < n) backtrack(list, s + "(", left + 1, right, n);
        if (right < left) backtrack(list, s + ")", left, right + 1, n);
    }
    public static void main(String[] args){
        var n = 3;
        System.out.println(generateParenthesis(n));
    }
}