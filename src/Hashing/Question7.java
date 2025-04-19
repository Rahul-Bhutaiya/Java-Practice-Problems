package Hashing;

import java.util.HashMap;
import java.util.Map;

//Most frequent element in an array
public class Question7 {
    public static void main(String[] args) {
        int[] arr={101,335,100,10,30,30,30,30,20,20,20,40,40,100,55,1};
        int maxFrequency=0;
        int result=0;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

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

        for(Map.Entry<Integer,Integer> eachEntry:hashMap.entrySet()){
            if(eachEntry.getValue()>maxFrequency){
                maxFrequency=eachEntry.getValue();
                result=eachEntry.getKey();
            }
        }
        System.out.println(result);
    }
}
//Time = O(N)
//Space = O(N)