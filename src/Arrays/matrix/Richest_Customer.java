package Arrays.matrix;
public class Richest_Customer {
    public static int maximumWealth(int[][] accounts) {
        var wealth = 0;
        var maximumWealth = 0;
        var i = 0;
        while (i < accounts.length){
            for (var j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            maximumWealth = Math.max(maximumWealth,wealth);
            wealth = 0;
            i++;
        }
        return maximumWealth;
    }
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
        int [][] accounts1 = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts1));
        int [][] account2 = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(account2));
    }
}