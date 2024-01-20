package basic_java;
import java.util.Scanner;
public class Yearly_Phone {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int lastTwoDigits = year % 100;
        if(lastTwoDigits == 0){
            System.out.println("K00");
        }else if(lastTwoDigits < 10){
            System.out.println("K0"+lastTwoDigits);
        }else{
            System.out.println("K"+lastTwoDigits);
        }
    }
}