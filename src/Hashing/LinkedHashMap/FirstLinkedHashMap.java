package Hashing.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstLinkedHashMap {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>(3,0.5f,true);
        linkedHashMap.put(10,"Rahul");
        linkedHashMap.put(20,"Utsav");
        linkedHashMap.put(30,"Dax");
        linkedHashMap.put(40,"Meet");

        linkedHashMap.get(20);

        System.out.println(linkedHashMap);
    }
}
