package Hashing.Assignment1;

import java.util.HashSet;

//Print all the duplicate numbers in array
public class Question2 {
    public static void main(String[] args) {
        int[] arr={100,10,20,30,30,30,20,40,40,100,55};

        HashSet<Integer> hashSet= new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();

        for(Integer each:arr){
            if(hashSet.contains(each)){//Time = O(1)
                duplicate.add(each);
            }
            else{
                hashSet.add(each);
            }
        }

        for(Integer eachElement:duplicate){
            System.out.print(eachElement+" ");
        }
    }
}
//Time = O(N)
//Space = O(N)