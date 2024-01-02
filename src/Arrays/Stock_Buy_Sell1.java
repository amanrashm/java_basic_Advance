package Arrays;
public class Stock_Buy_Sell1 {
    //Max possible difference between any 2 element
    public static int Stock_Buy_Sell1(int [] array){
        int maxProfit = 0;
        int minSoFar = array[0];
        for (int j : array) {
            minSoFar = Math.min(minSoFar, j);
            int profit = j - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] n = {3,2,5,4,8,7,1};
        System.out.println(Stock_Buy_Sell1(n));
    }
}