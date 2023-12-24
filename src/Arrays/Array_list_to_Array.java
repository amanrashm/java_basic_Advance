package Arrays;
import java.util.*;
public class Array_list_to_Array {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        List<String> arraylist = new ArrayList<>();
        for (int i = 0; i < 2 ; i++) {
            arraylist.add(sc.next());
        }
        arraylist.forEach(System.out::println);
        int n = arraylist.size();
        String [] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = arraylist.get(i);
            System.out.print("[ " + str[i] + " ]");
        }
    }
}