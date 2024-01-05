package Java8;

import static java.lang.Thread.sleep;

public class Method_Refrence {
    public static void main(String[] args) {
        Thread t = new Thread(Method_Refrence::printMsg);
        t.start();
    }

    private static void printMsg() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
