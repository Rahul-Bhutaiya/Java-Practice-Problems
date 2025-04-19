package Hashing;

import java.util.HashSet;

//Check if pair with given Sum exists in unsorted Array - O(N)
public class Question6 {
    public static void main(String[] args) {
        int[] arr={101,335,100,10,20,30,30,30,20,40,40,100,55,1};
        int sum=-31;
        HashSet<Integer> hashSet=new HashSet<>();

        for(Integer eachNumber:arr){
            hashSet.add(eachNumber);
        }

        for(Integer eachElement:hashSet){
            int required=sum-eachElement;

            if(hashSet.contains(required)){
                System.out.println("Present");
                return;
            }
        }
        System.out.println("Not Present");
    }
}
//Time = O(N)
//Space = O(N)