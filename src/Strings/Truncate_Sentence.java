package Strings;
public class Truncate_Sentence {
public static String truncateSentence(String s, int k) {
    String[] arr = s.split(" ");
    StringBuilder str1 = new StringBuilder();
    for (var i = 0; i < k; i++) {
        if (i == k - 1) {
            str1.append(arr[i]);
        } else {
            str1.append(arr[i]).append(" ");
        }
    }
    return str1.toString();
}
    public static void main(String[] args) {
        var s = "Hello how are you Contestant";
        var k = 4;
        System.out.println(truncateSentence(s, k));
    }
}
/*String[] arr = s.split(" ");
    var str1 = "";
    for (int i = 0; i < k; i++) {
        str1 += arr[i] + " ";
    }
    return str1.trim();*/
/*var sb = new StringBuilder();
        for (var i = 0; i < k; i++) {
            sb.append(arr[i]);
            if (i != k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();*/