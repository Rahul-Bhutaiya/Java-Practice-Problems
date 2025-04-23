package Hashing.Assignment1;

import java.util.HashMap;
import java.util.Map;

//Check if two arrays are equal or not
public class Question8 {
    public static void main(String[] args) {
        int[] arr1={100,50};
        int[] arr2={30,40,50,100,30,50};

        HashMap<Integer,Integer> hashMap=new HashMap<>();

//        if(arr1.length!=arr2.length){
//            System.out.println("Not Equal");
//            return;
//        }

        for(Integer eachNumber:arr1){
            if(hashMap.get(eachNumber)!=null){
                int currentFrequency = hashMap.get(eachNumber);
                int newFrequency=++currentFrequency;
                hashMap.put(eachNumber,newFrequency);
            }
            else{
                hashMap.put(eachNumber,1);
            }
        }

        for(Integer eachNumber:arr2){
            if(hashMap.get(eachNumber)!=null){
                int currentFrequency=hashMap.get(eachNumber);
                currentFrequency--;
                hashMap.put(eachNumber,currentFrequency);
            }
            else{
                System.out.println("Not Equal");
                return;
            }
        }

        for(Map.Entry<Integer,Integer> eachElement:hashMap.entrySet()){
            if(eachElement.getValue()!=0){
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
    }
}
