package Hashing;

import java.util.HashSet;

//Check whether array2 is subset of array1
public class Question4 {
    public static void main(String[] args) {
        int[] array1 = {11, 1, 13, 21, 3, 7};
        int[] array2 = {11, 3, 7, 100};

        HashSet<Integer> hashSet = new HashSet<>();

        for(Integer eachNumber:array1){
            hashSet.add(eachNumber);
        }

        for(Integer eachNumber:array2){
            if(!hashSet.contains(eachNumber)){
                System.out.println("Not Subset");
                return;
            }
        }
        System.out.println("It's Subset");
    }
}
//Time = O(N+M)
//Space = O(N)