package Arrays;
public class Stock_Buy_Sell1 {
    public static int Stock_Buy_Sell1(int [] array){
        int maxProfit = 0;
        int n = array.length;
        int minSoFar = array[0];

        for (int i = 0; i < n; i++) {
            minSoFar = Math.min(minSoFar , array[i]);
            int profit = array[i] - minSoFar;
            maxProfit = Math.max(maxProfit , profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] n = {3,2,5,4,8,7,1};
        System.out.println(Stock_Buy_Sell1(n));
    }
}