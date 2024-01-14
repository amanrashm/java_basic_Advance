package basic_java;

public class CountMatches {
    public static int numberOfMatches(int n) {
        var count = 0;
        while(n > 1){
            if((n & 1) == 0){
                count += n >> 1;
                n = n >> 1;
            }else{
                count += (n-1) >> 1;
                n = ((n-1) >> 1) + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
}