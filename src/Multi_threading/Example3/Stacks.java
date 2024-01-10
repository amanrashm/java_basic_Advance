package Multi_threading.Example3;
import lombok.Synchronized;
public class Stacks {
    private int[] array;
    private int stackTop;

    public Stacks(int size){
        array = new int[size];
        stackTop = -1;
    }
    @Synchronized
    public boolean push(int value){
        if(isFull())
            return false;
        ++stackTop;
        try{
            Thread.sleep(1000);
        }catch(Exception e){}

        array[stackTop] = value;
        return true;
    }
    @Synchronized
    public int pop(){
        if(isEmpty()) return Integer.MIN_VALUE;
        int value = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;

        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        stackTop--;
        return value;
    }

    public boolean isEmpty(){
        return stackTop < 0;
    }

    public boolean isFull(){
        return stackTop >= array.length - 1;
    }

    public static void main(String... args){
        var stack = new Stacks(5);
        /*var t1 = new Thread(() -> {
            for(int i=0;i<10;i++)
                System.out.println("pushed: " + stack.push(i) + " " + Thread.currentThread());
        },"MyThread1");
        var t2 = new Thread(() -> {
            for(int i=0;i<10;i++)
                System.out.println("popped: " + stack.pop() + " " + Thread.currentThread());
        },"MyThread2");
        t1.start();
        t2.start();*/

        new Thread(()->{
            int count = 0;
            while(++ count < 10){
                System.out.println("pushed: " + stack.push(100) + " " + Thread.currentThread());
            }
        },"pusher ").start();

        new Thread(()->{
            int count = 0;
            while(++ count < 10){
                System.out.println("popped: " + stack.pop() + " " + Thread.currentThread());
            }
        },"popper").start();
        System.out.println("main thread ends");
    }
}