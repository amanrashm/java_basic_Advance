package basic_java;
public class even_odd {
    public static boolean even_odd(int n){
        if((n & 1) == 0 ){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        if(even_odd(10)== true){
            System.out.println("even");
        }
        else System.out.println("odd");
    }
}