package Multi_threading.Producer_Consumer_Pattern;
import java.util.Queue;
// this will give you a deadlock
// because if you use if instead of while
// then the thread will not be notified
// and will wait forever

/*public boolean add(int item){
    synchronized(q){
        if(q.size() == capacity){
            //Do Something
            try {
                q.wait();//adder1 waits here , adder2 waits here
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        q.add(item);
        q.notifyAll();
        return true;
    }
}
public int remove(){
    synchronized(q){
        if(q.size() == 0){
            //Do Something
            try {
                q.wait();//remover1 waits here , remover2 waits here
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        int element = q.poll();
        q.notifyAll();
        return element;
    }
}*/
public class BlockingQueue {
    private Queue<Integer> q;
    private int capacity;
    public BlockingQueue(int capacity){
        q = new java.util.LinkedList<>();
        capacity = capacity;
    }
    public boolean add(int item){
        synchronized(q){
            while(q.size() == capacity){
                //Do Something
                try {
                    q.wait();//adder1 waits here , adder2 waits here
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            q.add(item);
            q.notifyAll();
            return true;
        }
    }
    public int remove(){
        synchronized(q){
            while(q.size() == 0){
                //Do Something
                try {
                    q.wait();//remover1 waits here , remover2 waits here
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            int element = q.poll();
            q.notifyAll();
            return element;
        }
    }
    public static void main(String[] args){
        /*Thread thread = new Thread(() -> {
            try{
                Thread.sleep(1);
                for(int i = 10000; i > 0; i--);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        },"States");
        thread.start();
        while(true){
            Thread.State state = thread.getState();
            System.out.println(state);
            if(state == Thread.State.TERMINATED) break;
        }*/
        /*Thread thread = new Thread(() ->{
            System.out.println(Thread.currentThread());
        },"Our Thread");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main Thread Exiting");*/
        //Deadlock
        // creating a deadlock situation through code
        var lock1 = "lock1";
        var lock2 = "lock2";

        Thread thread = new Thread(() -> {
            synchronized(lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("Thread 1 Lock Acquired");
                }
            }
            },"Thread 1");
        Thread thread2 = new Thread(() -> {
            synchronized(lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("Thread 2 Lock Acquired");
                }
            }
        },"Thread 2");
      thread.start(); thread2.start();
    }
}
/*Thread adder1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    q.add(i);
                }
            }
        });
        Thread adder2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    q.add(i);
                }
            }
        });
        Thread remover1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    q.remove();
                }
            }
        });
        Thread remover2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    q.remove();
                }
            }
        });
        adder1.start();
        adder2.start();
        remover1.start();
        remover2.start();*/