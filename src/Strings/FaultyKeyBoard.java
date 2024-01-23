package Strings;
public class FaultyKeyBoard {
    public static String finalString(String s) {
        var sb = new StringBuilder();
        var ch = s.toCharArray();
        var i = 0;
        for (; i < ch.length; i++) {
            if (!(ch[i] == 'i')) {
                sb.append(ch[i]);
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        var s = "string";
        var res = finalString(s);
        System.out.println(res);
    }
}
