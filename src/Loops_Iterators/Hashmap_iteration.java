package Loops_Iterators;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_iteration {
    public static void main(String[] args) {
        Map <String , Integer> map = new HashMap<>();
        //Insertion in Hashmap
        map.put("India" , 120);
        map.put("Usa" , 20);
        map.put("China" , 150);
        System.out.println(map);

        //Search / Lookup operation
        if(map.containsKey("China"))
            System.out.println("present");
        System.out.println("not present");

        //Iteration over a map
        //Map.Entry<String , Integer> element = map.entrySet();
        // Iteration in hashmap through entrySet();
        for (Map.Entry<String , Integer> element : map.entrySet()){
            System.out.println(element.getKey());
            System.out.println(element.getValue());
            System.out.println(element);
        }

        //Iteration in HashMap through keySet();
        Set<String> keys = map.keySet();
        for(String key : keys) System.out.println(key +" "+ map.get(key));

        //remove pair from HashMap
        map.remove("China");
        System.out.println(map);
    }
}