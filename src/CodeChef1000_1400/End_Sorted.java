package CodeChef1000_1400;
public class End_Sorted {
    public static void main(String... args) {
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int nums[] = new int[l];
            for (int i = 0; i < l; ++i) nums[i] = sc.nextInt();
            int p1 = 0;
            int p2 = 0;
            while (nums[p1++] != 1) ;
            while (nums[p2++] != l) ;
            int moves = p1 + (l - 1 - p2);
            if (p1 > p2)
                --moves;

            System.out.println(moves);
        }
    }
}