package basic_java;
public class Smallest_Even_Multiple {
    public static int smallestEvenMultiple(int n) {
        if((n & 1) ==0)
            return n;
        else
            return (n << 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(smallestEvenMultiple(n));
    }
}