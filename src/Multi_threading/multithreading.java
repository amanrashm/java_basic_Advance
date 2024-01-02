package Multi_threading;
public class multithreading implements Runnable{
    public static void main(String[] args) {
        var multithreading = new multithreading();
        var t1 = new Thread(multithreading);
        t1.start();
        var thr = new Thread(multithreading);
        thr.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Aman :- " + i);
            try {
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}