package Arrays;
public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        var sb = new StringBuilder();
        var count = 0;
        for(var i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(count > 0)
                    sb.append(s.charAt(i));
                count++;
            }else{
                count--;
                if(count > 0)
                    sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String... args){
        var s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}