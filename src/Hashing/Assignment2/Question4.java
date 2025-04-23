package Hashing.Assignment2;

//Q4. Group Strings by Length
//Input: ["hi", "hello", "hey", "welcome", “how”]
//Output: 2=[hi], 3=[hey, how], 5=[hello], 7=[welcome]

import java.util.ArrayList;
import java.util.HashMap;

public class Question4 {
    public static void main(String[] args) {
//        String[] input={"hi","ra","pa", "hello", "hey", "welcome","how"};
        String[] input={"hi","ra","pa","k"};

        HashMap<Integer, ArrayList<String>> hashMap=getGroupedStrings(input);
        System.out.println(hashMap);

    }

    public static HashMap<Integer, ArrayList<String>> getGroupedStrings(String[] stArr){
        HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();

        for(String st:stArr){
            int length=st.length();

            if(hashMap.containsKey(length)){
                ArrayList<String> arl = hashMap.get(length);
                arl.add(st);
            }
            else{
                ArrayList<String> arl=new ArrayList<>();
                arl.add(st);
                hashMap.put(length,arl);
            }
        }
        return hashMap;
    }
}
