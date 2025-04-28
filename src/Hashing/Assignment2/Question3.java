package Hashing.Assignment2;

//Q3. Group Anagrams
//Given a list of strings, group the anagrams together.
//Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        String[] words={"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();


        for(String word:words){
            String sortedWord=sortWord(word);
            if(hashMap.containsKey(sortedWord)){
                hashMap.get(sortedWord).add(word);
            }else{
                ArrayList<String> arl=new ArrayList<>();
                arl.add(word);
                hashMap.put(sortedWord,arl);
            }
        }

        for(Map.Entry<String,ArrayList<String>> entry:hashMap.entrySet()){
            entry.getValue();
        }

    }

    public static String sortWord(String word){
        char[] charArr=word.toCharArray();
        Arrays.sort(charArr);
        return String.valueOf(charArr);
    }


    public String getSortedString(String word){
        int[] ascArr = new int[26];
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<word.length();i++){
            int asc = word.charAt(i);
            ascArr[asc-'a']++;
        }

        for(int i=0;i<26;i++){
            sb.append(ascArr[i]).append('#');
        }

        return sb.toString();
    }
}