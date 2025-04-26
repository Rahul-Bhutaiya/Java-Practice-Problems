package Hashing;

import java.util.HashSet;

public class FirstHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(30);

        System.out.println(hashSet);
//        hashSet.remove(10);
//        System.out.println(hashSet);
//        System.out.println(hashSet.size());

//        for(Integer eachElement:hashSet){
//            System.out.print(eachElement+" ");
//        }


//        System.out.println(hashSet.contains(10));

        
    }

}
