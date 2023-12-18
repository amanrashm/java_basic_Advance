package basic_java;

public class Set_ith_bit {
    public static int Set_ith_bit(int n, int i){
       /* if(i < 0 || i >= 32) {
            return -1;
        }

        int mask = 1 << i;
        n = n | mask;
        if(n != 0 ){
            return 1;
        }return 0;*/
        return ((1 << i) | n);
    }
    public static void main(String[] args) {
        System.out.println(Set_ith_bit(4,11));
        System.out.println(Set_ith_bit(20, 4));
        System.out.println(Set_ith_bit(20, 100));
    }
}