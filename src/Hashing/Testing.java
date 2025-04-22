package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Testing {
    public static void main(String[] args) {
        ArrayList<Integer> arl=new ArrayList<>();

//        Node n1=new Node();
//        arl.add(5,n1);
        arl.add(0,10);
        arl.add(1,20);
        arl.add(2,30);
        arl.set(2,40);
//        arl.add(2,40);
//        arl.add(3,40);
//        arl.add(4,50);
//        arl.add(5,20);
//        arl.add(6,20);
//        arl.add(7,20);
//        arl.add(8,20);
//        arl.add(9,20);
//        arl.add(10,20);

        System.out.println(arl);

//        System.out.println(arl.get(13));

        HashMap<Integer,String> hashMap=new HashMap<>(66);
//        HashSet<Integer> hashSet=new HashSet<>();
//
//        hashMap.put(10,"Rahul");
//        hashMap.put(11,"Umesh");
//        hashMap.put(12,"Prakash");
//        hashMap.put(13,"Shailesh");
//
//        System.out.println(hashMap.containsValue("Rahu"));
    }
}

class Node{
    int val;
    Node next;
}
