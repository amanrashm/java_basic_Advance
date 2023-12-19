package basic_java;
public class even_odd {
    public static boolean even_odd(int n){
        return (n & 1) == 0;
    }
    public static void main(String[] args) {
        if(even_odd(13)){
            System.out.println("even");
        }
        else System.out.println("odd");
    }
}