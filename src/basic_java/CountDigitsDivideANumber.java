package basic_java;
public class CountDigitsDivideANumber {
    public static int countDigits(int num) {
        var count = 0;
        var temp = num;
        while(temp > 0) {
            var remainder = temp % 10;
            if(num % remainder == 0) count++;
            temp /= 10;
        }
        return count;
    }
    public static void main(String... args) {
        System.out.println(countDigits(121));
    }
}