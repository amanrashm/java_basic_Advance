package Arrays;
public class Even_Number_digits {
    public static int evenNumber(int[] arrays) {
        int count = 0;
        int n = arrays.length;
        for (int i = 0; i < n; i++) {
            int  count1=0;
            while (arrays[i] > 0){
                count1++;
                arrays[i]=arrays[i]/10;
            }
            if((count1 & 1) == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] n = {12, 345, 2, 6, 7896};
        System.out.println(evenNumber(n));
    }
}