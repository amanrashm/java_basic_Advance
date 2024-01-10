package Multi_threading.Example1;

import Multi_threading.Example1.Company;

class Consume extends Thread{
    Company c;
    Consume(Company c)
    {
        this.c=c;
    }
    public void run()
    {
        while(true)
        {
            try {
                this.c.consume_item();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(2000);
            }catch(Exception e){

            }
        }
    }
}