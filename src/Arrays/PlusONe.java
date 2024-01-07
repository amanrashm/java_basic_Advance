package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusONe {
    public int[] plusOne(int[] digits) {
        /*var carry = 1;
        for (var i = digits.length - 1; i >= 0; i--) {
            var sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 0) return digits;
        var result = new int[digits.length + 1];
        result[0] = carry;
        IntStream.range(1, result.length).forEachOrdered(i -> result[i] = digits[i - 1]);
        return result;*/
        for(var i = digits.length-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String [] args){
        int [] digits = {1,2,3};
        var result = new PlusONe().plusOne(digits);
        Arrays.stream(result).mapToObj(j -> j + " ").forEachOrdered(System.out::print);
    }
}