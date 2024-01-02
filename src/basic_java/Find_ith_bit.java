package basic_java;
public class Find_ith_bit {
    public static void Find_ith_bit(int n, int i){
       /* if(i < 0 || i >= 32) {
            return -1;
        }
        int mask = 1 << i;
        n = n & mask;
        if(n != 0){
            return 1;
        } else {
            return 0;
        }*/
        //System.out.println(((n & (1 << (i - 1))) >> (i - 1)));
        System.out.println((n >> (i-1)) % 2);
    }
    public static void main(String[] args) {
        /*System.out.println(Find_ith_bit(2,1));
        System.out.println(Find_ith_bit(20, 3));
        System.out.println(Find_ith_bit(20, 100));*/
        int n =20 , i = 3;
        Find_ith_bit(n,i);
    }
}