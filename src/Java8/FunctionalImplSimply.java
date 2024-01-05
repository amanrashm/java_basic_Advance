package Java8;

import java.util.Scanner;

public class FunctionalImplSimply implements Functional_Interface{
    /**
     * @param n1
     * @param n2
     * @return
     */
    @Override
    public int addition(int n1, int n2) {
        /*Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();*/
        var sum = n1 + n2;
        return sum;
    }
    /**
     *
     */
    @Override
    public void display() {

        Functional_Interface.super.display();
    }
    public static void main(String[] args) {
        FunctionalImplSimply obj = new FunctionalImplSimply();
        System.out.println(obj.addition(5, 6));
        // It uses class object too to call the default method
        obj.display();
        Functional_Interface.show();
    }
}
