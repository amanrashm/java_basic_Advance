package Loops_Iterators;
import java.util.ArrayList;
public class Even_odd_Iterator {
    public static void main(String[] args) {
        var even = new ArrayList<>();
        for(int i = 0; i <= 10; i+=1){
            even.add(i);
        }
        var itr = even.iterator();
        while(itr.hasNext()) {
            var i = (Integer) itr.next();
            if ((i & 1) == 0){
                System.out.println(i);
            }else itr.remove();
        }
        System.out.println(even);
    }
}