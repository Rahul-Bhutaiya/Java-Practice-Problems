package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(11,"Rahul");
        hashMap.put(2,"Urvish");
        hashMap.put(33,"Sallu");
        hashMap.put(4,"Mayank");
        hashMap.put(5,"Mayank");
        hashMap.put(6,"Mayank");
        hashMap.put(78,"Mayank");
        hashMap.put(8,"Mayank");
        hashMap.put(9,"Mayank");
        hashMap.put(9,"Mayank2");

        System.out.println(hashMap.get(11));
//        System.out.println(hashMap);

//        System.out.println(hashMap.get(9));//Mayank
//        System.out.println(hashMap.get(90));//null

//        for(Map.Entry eachEntry:hashMap.entrySet()){
//            System.out.println(eachEntry.getKey() + " == " + eachEntry.getValue());
//        }

//        Set<Map.Entry<Integer,String>> set=hashMap.entrySet();
//        for(Map.Entry eachEntry:set){
//            System.out.println(eachEntry);
//        }
    }
}
