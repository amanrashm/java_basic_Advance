package Strings;
public class RingsAndRods {
    public static int countPoints(String rings) {
        var count = 0;
        var n2 = rings.length();
        var n = n2 / 2;
        var rods = new int[n];
        var points = new int[n];
        return count;
    }
    public static void main(String[] args) {
        var rings = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }
}