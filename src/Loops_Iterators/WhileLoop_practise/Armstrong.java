package Loops_Iterators.WhileLoop_practise;

public class Armstrong {
    // What is ArmStrong number ?
    // example1 :- 153 -> 1 5 3
    // 1*1*1 + 5*5*5 + 3*3*3 =
    // 1+125+27 = 153
    // if input and cube of all int available in input is same then it is ArmStrong Number..
    public static void main(String[] args) {
        var num = 370;
        var temp = num;
        var remainder = 0;
        var sum = 0;
        while(num>0){
            remainder = num % 10;
            num = num / 10;
            sum = sum + remainder*remainder*remainder;
        }
        if (sum == temp) {
            System.out.println("this is ArmStrong Program");
        }else System.out.println("not an ArmStrong Number");
    }
}
