package basic_java;
public class Int_Roman {
    public static String intToRoman(int num) {
        var ones = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        var tens = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        var hrns = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        var ths  = new String[]{"","M","MM","MMM"};
        return ths [num / 1000] + hrns [(num % 1000) / 100] + tens[(num % 100)/ 10] + ones[num % 10];
    }
    public static void main(String[] args) {
        var num = 53;
        System.out.println(intToRoman(num));
    }
}