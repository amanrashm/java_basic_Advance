package basic_java;
public class Achievable_Number {
    public static int theMaximumAchievableX(int num, int t) {
        return num + (t *2);
    }
    public static void main(String[] args) {
        var num = 4;
        var t = 1;
        System.out.println(theMaximumAchievableX(num, t));
    }
}