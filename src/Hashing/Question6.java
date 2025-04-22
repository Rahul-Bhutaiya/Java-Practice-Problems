package Hashing;

import java.util.HashSet;

//Check if pair with given Sum exists in unsorted Array - O(N)
public class Question6 {
    public static void main(String[] args) {
//        int[] arr={101,335,100,10,20,30,30,30,20,40,40,100,55,1};
//        int target=42;
        int[] arr={2,10,5,10};
        int target=20;
        HashSet<Integer> hashSet=new HashSet<>();

        for(int num:arr){
            int required=target-num;
            if(hashSet.contains(required)){
                System.out.println("Present");
                return;
            }
            else{
                hashSet.add(num);
            }
        }
        System.out.println("Not Present");
    }
}
//Time = O(N)
//Space = O(N)