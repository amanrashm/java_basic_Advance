package basic_java;
import java.util.concurrent.atomic.AtomicInteger;
public class EvenSumbetweenNumbers {
    public static int countEven(int num) {
        AtomicInteger sum = new AtomicInteger(num % 10 + (num / 10) % 10 + (num / 100) % 10 + (num / 1000) % 10);
        if((sum.get() & 1) == 0 & (num & 1) == 0){
            return (num - 1) / 2 + 1;
        }
        else{
            return (num - 1) / 2;
        }
    }
    public static void main(String[] args) {
     var num = 30;
        System.out.println(countEven(num));
    }
}