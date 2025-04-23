package Hashing.Assignment1;

import java.util.HashSet;

//Print all distinct numbers in array
public class Question1 {
    public static void main(String[] args) {
        int[] arr={100,10,20,30,30,20,40,40,100};

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }

        for(Integer eachElement:hashSet){
            System.out.print(eachElement+" ");
        }
    }
}
//Time = O(N)
//Space = O(N)