package Multi_threading;
public class LambdaRunnable {
    public static void main(String... args){
        var t4 = new Thread(() -> {
            for(int i=0;i<10;i++)
                System.out.println("this is users defined thread."+ i + " " + Thread.currentThread());
        },"MyThread4");
        t4.start();
        t4.setName("MyThread5");
        t4.setPriority(10);
    }
}