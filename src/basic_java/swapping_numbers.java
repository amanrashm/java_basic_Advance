package basic_java;

public class swapping_numbers {
    public static void swapping_numbers(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("x = " + a + " , y = " + b);
    }
    public static void main(String[] args) {
        swapping_numbers(10,20);
    }
}