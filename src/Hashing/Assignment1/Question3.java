package Hashing.Assignment1;

import java.util.HashSet;

//Print all unique numbers in array
public class Question3 {
    public static void main(String[] args) {
        int[] arr={101,335,100,10,20,30,30,30,20,40,40,100,55};

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(Integer eachNumber:arr){
            if(hashSet.contains(eachNumber)){
                duplicate.add(eachNumber);
            }else{
                hashSet.add(eachNumber);
            }
        }

        for(Integer eachNumber:hashSet){
            if(!duplicate.contains(eachNumber)){
                System.out.print(eachNumber+" ");
            }
        }
    }
}
//Time = O(N)
//Space = O(N)