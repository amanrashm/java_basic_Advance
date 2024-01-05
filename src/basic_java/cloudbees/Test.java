package basic_java.cloudbees;

import java.lang.reflect.Array;
import java.util.Arrays;
/*public interface HasWater{
    public boolean isBlue();
    void wet();
}

interface IsSalty{
    static final String color = "clear";
    Boolean isBlue();
    public void wet();
}
interface IsSea extends HasWater, IsSalty{}

abstract public final class Ocean implements IsSalty{}*/

/*single Entry Point
* Traditional Server Side Application
* Browser / Native App
* Client specific App
* Protocol Translation
* Rest | Catelog Service
* Rest | Recommendation Service
* AMQP Review Service*/
public class Test {
    public static void main(String[] args) {
        int [] x = {7,8,9}; int [] y = {7, 7, 7};
        System.out.println(Arrays.compare(x,y)+ " " + Arrays.mismatch(x,y));
    }
}
