package Hashing.Assignment2;

//Q2. First Non-Repeating Character
//Input: "aabbcddbe"
//Output: "c"

import java.util.HashSet;

public class Question2 {
    public static void main(String[] args) {
//        String input="aabbcddbe";
        String input="aabbcd";
        System.out.println(getFirstNonRepeating(input));
    }

    public static Character getFirstNonRepeating(String input){
        HashSet<Character> hashSet=new HashSet<>();
        HashSet<Character> duplicate=new HashSet<>();

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(hashSet.contains(ch)){
                duplicate.add(ch);
            }
            else{
                hashSet.add(ch);
            }
        }
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(!duplicate.contains(ch)){
                return ch;
            }
        }
        return null;
    }

    public static Character getFirstNonRepeating2(String input){
        int[] ascArr=new int[128];

        for(int i=0;i<input.length();i++){
            int asc=input.charAt(i);
            ascArr[asc]++;
        }

        for(int i=0;i<input.length();i++){
            int asc=input.charAt(i);
            if(ascArr[asc]==1){
                return (char)asc;
            }
        }
        return null;
    }
}
