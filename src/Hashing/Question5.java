package Hashing;

import java.util.HashMap;
import java.util.Map;

//Count frequency of each number in array
public class Question5 {
    public static void main(String[] args) {
        int[] arr={100,10,20,30,55,30,30,20,40,40,100,55,-55,55,55,55,55,5};

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(Integer eachNumber:arr){
            if(hashMap.get(eachNumber)!=null){
                int currentFrequency = hashMap.get(eachNumber);
                int newFrequency=++currentFrequency;
                hashMap.put(eachNumber,newFrequency);
            }
            else{
                hashMap.put(eachNumber,1);
            }
        }

        for(Map.Entry eachEntry:hashMap.entrySet()){
            System.out.println(eachEntry.getKey() + " = " + eachEntry.getValue());
        }
    }
}
//Time = O(N)
//Space = O(N)