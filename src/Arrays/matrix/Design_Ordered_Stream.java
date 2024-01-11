package Arrays.matrix;
import java.util.*;
public class Design_Ordered_Stream {
    //TODO: need to try Again
    private Map<Integer, String> map;
    int count = 1;
    public Design_Ordered_Stream(int n) {
        map = new TreeMap<>();
    }
    public List<String> insert(int idKey, String value) {
        var list = new ArrayList<String>();
        if(idKey == count) {
            list.add(value);
            while(map.containsKey(++count)) list.add(map.remove(count));
        }
        else map.put(idKey, value);
        return list;
    }
    public static void main(String... args) {
        Design_Ordered_Stream os = new Design_Ordered_Stream(5);
        var sc = new Scanner(System.in);
        for(var i = 0; i < 5; i++){
            var idKey = sc.nextInt();
            var value = sc.next();
            System.out.println(os.insert(idKey, value));
        }
    }
}