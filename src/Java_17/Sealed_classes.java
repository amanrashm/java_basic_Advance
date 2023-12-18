package Java_17;

sealed class Sealed_classes1 permits Sealed_classes2,Sealed_classes3{

}
non-sealed class Sealed_classes2 extends Sealed_classes1 {

}
final class Sealed_classes3 extends Sealed_classes1 {

}
class Sealed_classes4 extends Sealed_classes2{

}
sealed interface Sealed_Interface1 permits Y{

}
non-sealed interface Y extends Sealed_Interface1 {

}
public class Sealed_classes {
    public static void main(String[] args) {

    }
}