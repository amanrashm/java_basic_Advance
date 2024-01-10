package Multi_threading.Example1;
class Main
{
    public static void main(String[] args) {
        Company comp=new Company();
        Producer p=new Producer(comp);
        Consume c=new Consume(comp);
        p.start();
        c.start();
        /*p.stop();
        c.stop();*/
    }
}