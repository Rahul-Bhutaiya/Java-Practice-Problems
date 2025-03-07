package String.Assignment;

import java.util.Arrays;

//Sort a string of lowercase
public class Question7 {
    public static void main(String[] args) {

        String s1="bhutaiya";
//        String s1="addzero";
//        System.out.println(AnswerQ7.getSortedString(s1));
        System.out.println(AnswerQ7.getSortedString2(s1));

    }
}

class AnswerQ7{
    static String getSortedString(String input){//T = O(n*n)
        char[] charArray=input.toCharArray();

        for(int i=0;i<charArray.length-1;i++){
            boolean isSwapped=false;
            for(int j=0;j<charArray.length-1-i;j++){
                if(charArray[j]>charArray[j+1]){
                    char temp=charArray[j];
                    charArray[j]=charArray[j+1];
                    charArray[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return new String(charArray);
    }

    static String getSortedString2(String input){
        int[] asciArray=new int[128];
        String result="";//S->O(n)

        for(int i=0;i<input.length();i++){//T->O(n)
            int asciiIndex=input.charAt(i);
            asciArray[asciiIndex]++;
        }
        for (int i=97;i<=122;i++){ //T->O(n)
            if(asciArray[i]>0){
                char ch=(char)i;
                for(int j=0;j<asciArray[i];j++){
                    result+=ch;//S->O(n)
                }
            }
        }
        return result;
    }
}

