package Arrays;
import java.util.ArrayList;
import java.util.List;
public class Greatest_Candies {
    public static List<Boolean> kidsCandies(int [] candies , int extraCandies){
        List<Boolean> ifCandyGreatest = new ArrayList<>();
        int n = candies.length;
        int totalCandy = 0;
        for (int i = 0; i < n; i++) {
            totalCandy = (candies[i]+extraCandies);
            boolean val = true;
            for (int j = 0; j < n; j++) {
                if(i != j){
                    if(totalCandy < candies[j]){
                        val = false;
                        break;
                    }
                }
            }
            ifCandyGreatest.add(val);
        }
        return ifCandyGreatest;
    }
    public static void main(String[] args) {
        int [] n = {2,3,5,1,3};
        System.out.println(kidsCandies(n, 3));
    }
}