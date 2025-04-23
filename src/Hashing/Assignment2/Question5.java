package Hashing.Assignment2;

//Q5. Intersection of Two Arrays
//Input: [1, 2, 3, 4], [3, 4, 5, 6]
//Output: [3, 4]

import java.util.ArrayList;
import java.util.HashSet;

public class Question5 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={3,4,4,5,6};
        HashSet<Integer> hashSet=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }

        for(int i=0;i< arr2.length;i++){
            if(hashSet.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
                hashSet.remove(arr2[i]);
            }
        }
    }
}
