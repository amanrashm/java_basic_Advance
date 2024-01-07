package basic_java;
public class AddBinary {
    public static String addBinary(String a, String b) {
        var result = new StringBuilder();
        var i = a.length() - 1;
        var j = b.length() - 1;
        var carry = 0;
        while (i >= 0 || j >= 0) {
            var sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) result.append(carry);
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        var a = "11";
        var b = "1";
        System.out.println(addBinary(a, b));
    }
}