package basic_java;
public class Sum_Multiples {
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for(int i = 1;i <= n; i++) if (i % 3 == 0 | i % 5 == 0 | i % 7 == 0) sum += i;
        return sum;
    }
    // TODO: need to ask
    //most efficient solution
    /*return sum(n,3)+sum(n,5)+sum(n,7) - sum(n,15) - sum(n,21) - sum(n,35) + sum(n,105);
    }

    int sum(int n, int x){
        int head = 1;
        int tail = n/x;
        return (head+ tail)*tail/2 * x;
    }*/
    public static void main(String... args) {
        System.out.println(sumOfMultiples(7));
    }
}