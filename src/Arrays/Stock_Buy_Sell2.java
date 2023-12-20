package Arrays;
public class Stock_Buy_Sell2 {
    public static int Stock_Buy_Sell2(int [] array){
        var n = array.length;
        var profit = 0;
        for (int i = 1; i < n; i++) {
            if(array[i] > array[i-1]){
                profit += (array[i] - array[i - 1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] n = {5,2,6,1,4,7,3,6};
        System.out.println(Stock_Buy_Sell2(n));
    }
}