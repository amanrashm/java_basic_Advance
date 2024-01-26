package basic_java;
public class GCD_HCF {
    public static int GCD_HCF(int a, int b){
        /*if(b==0) return a; return GCD_HCF(b,a % b);*/
        return a % b ==0 ? b : GCD_HCF(b,a % b);
    }
    public static void main(String[] args) {
        System.out.println(GCD_HCF(3, 2));
    }
}