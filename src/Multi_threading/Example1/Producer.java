package Multi_threading.Example1;

import Multi_threading.Example1.Company;

class Producer extends Thread
{

    Company c;
    Producer(Company c)
    {
        this.c=c;
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            try {
                this.c.produce_item(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(1000);
            }catch(Exception e){

            }
            i++;
        }
    }
}