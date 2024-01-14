package Loops_Iterators.forloop_practise;
import static Arrays.Linear_Search.linearSearch;
public class Linear_search {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int target = 5;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        if (ans != -1)
            System.out.println("Element found at index:- "+ans);
        else System.out.println("Element not found at any index. "+ans);
    }
}