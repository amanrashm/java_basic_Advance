package Multi_threading.VolatileKeyWord;

public class TvSet {
    private static volatile TvSet instance = null;
    private TvSet(){
        System.out.println("TvSet instantiated");
    }
    public static TvSet getInstance(){
        if(instance == null){ //Optimization
            synchronized(TvSet.class){ //t2
                if(instance == null) //double check
                    instance = new TvSet();
            }
        }//Heavy operation
        return instance;
    }
}
