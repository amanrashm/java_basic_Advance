package Java8;
@FunctionalInterface
public interface Functional_Interface {
        int addition(int n1,int n2);

        default void display() {
                System.out.println("This is a default method");
        }

        static void show() {
                System.out.println("This is a static method");
        }

        // This is not a functional interface as it contains more than one abstract method

}