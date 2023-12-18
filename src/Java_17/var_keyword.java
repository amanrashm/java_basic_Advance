package Java_17;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class var_keyword {
    public static void main(String[] args) throws Exception {
        //Normal way
        /*InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        ArrayList<String> names = new ArrayList<>();*/

        //The var way
        // The dynamic type way
        // it can't be instance variable
        // it can only be local variable var is a
        var reader = new InputStreamReader(System.in);
        var bufferedReader = new BufferedReader(reader);
        var names = new ArrayList<>();

        //static typed language
        var num = 9;
        var pi =3.14f;

        names.add(bufferedReader.readLine());
        names.add(bufferedReader.readLine());

        System.out.println(names);
        System.out.println(num);
        System.out.println(pi);
    }
}