package Hashing.Assignment2;

//Q1. Word Frequency Counter
//Input: "Java is great. Java is fast."
//Output: java=2, is=2, great=1, fast=1

import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        String input="    Jav'a   is  a great. Java is fast.   kkk a  ";
        HashMap<String,Integer> hashMap=countFrequency(input);
        System.out.println(hashMap);
    }

    public static HashMap<String,Integer> countFrequency(String input){
        HashMap<String,Integer> hashMap=new HashMap<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<=input.length();i++){
            char ch=' ';
            if(i<input.length()){
                ch=input.charAt(i);
            }

            if((i==input.length() || ch==' ' ) && !sb.isEmpty()){
                if(hashMap.containsKey(sb.toString())){
                    int currentFreq=hashMap.get(sb.toString());
                    currentFreq++;
                    hashMap.put(sb.toString(),currentFreq);
                }
                else{
                    hashMap.put(sb.toString(),1);
                }
                sb.setLength(0);
            }
            else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || ch==39){
                sb.append(Character.toLowerCase(ch));
            }

        }

        return hashMap;
    }

//    method:2

    public static HashMap<String, Integer> countFrequency2(String input) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Convert to lowercase and split using regex: keep a-z and apostrophes
        String[] words = input.toLowerCase().split("[^a-z']+");

        for (String word : words) {
            if (!word.isEmpty()) {
                hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
            }
        }

        return hashMap;
    }

}
