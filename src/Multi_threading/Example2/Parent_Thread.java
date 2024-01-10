package Multi_threading.Example2;
public class Parent_Thread {
    public static void main(String [] args){
        //main thread... started..
        //main() by default is a User Thread.
        //order isn't followed here. it depends on platform and jvm.
        System.out.println("main thread started..");
        //t1 is child thread of main thread.
        var t1 = new Thread1();
//        t1.setDaemon(true);
//        t1.setName("MyThread");
//        t1.getName();
        t1.start();
        t1.setName("MyThread");
        t1.setPriority(10);
        //main thread... ended..
        System.out.println("main thread ended.."+Thread.currentThread().getName());
        System.out.println("User thread ended.." + t1.getName());
        var t2 = new Thread2();
        var t3 = new Thread(()->{
            for(int i=0;i<10;i++)
                System.out.println("this is users defined thread."+ i + " " + Thread.currentThread());
        },"MyThread2");//new Thread((
        t3.start();
        t3.setName("MyThread3");
        t3.setPriority(10);
    }
    // this thread is created using instance of Thread class.
    static class Thread1 extends Thread{
        public void run(){
            //task for thread...
            //this is user defined thread. that's why it is running even after execution of main thread is done
            for(int i=0;i<10;i++)
                System.out.println("this is user defined thread."+ i + " " + Thread.currentThread());
            //Thread[MyThread   ,10     ,main]
            // thread name, priority, group name
        }
    }
}
//this is user defined thread. that's why it is running even after execution of main thread is done
//this thread is created using instance of Runnable interface.
//better way is to follow Runnable interface. has no constraints
// but if we extend Thread class then we do have constraints.
//multiple inheritance isn't supported in java. but
// multiple inheritance/implementation of interface is supported.
class Thread2 implements Runnable{
    public void run(){
        //task for thread...
        //this is user defined thread. that's why it is running even after execution of main thread is done
        /*for(int i=0;i<10;i++)
            System.out.println("this is users defined thread."+ i + " " + Thread.currentThread());*/
        //Thread[MyThread   ,5     ,main]
        // thread name, priority, group name
    }
}