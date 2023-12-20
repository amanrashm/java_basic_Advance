package Loops_Iterators;
import java.util.Arrays;
import java.util.function.Consumer;
public class for_each_method {
    public static void main(String[] args) {
        var nums = Arrays.asList(10,20,30,40,50,60);
       /* var con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        nums.forEach(con);*/
        Consumer<Integer> con = integer -> System.out.println(integer);
        nums.forEach(con);
    }
}