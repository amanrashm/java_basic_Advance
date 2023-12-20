package Arrays;
import java.util.*;
public class Array_list_to_Array {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        List<String> arraylist = new ArrayList<>();
        //taking input from user
        for (int i = 0; i < 2 ; i++) {
            arraylist.add(sc.next());
        }
        //print arraylist
        arraylist.forEach(System.out::println);
        // add to array
        int n = arraylist.size();
        String [] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = arraylist.get(i);
            System.out.print("[ " + str[i] + " ]");
        }
    }
}