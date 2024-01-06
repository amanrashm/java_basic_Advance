package basic_java;
public class SubtractTheProductAndSumOfInteger {
    public static int subtractProductAndSum(int n) {
        var product = 1;
        var sum = 0;
        while(n > 0){
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
    }
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }
}