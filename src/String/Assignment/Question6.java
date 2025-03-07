package String.Assignment;

//Update a character in a string (without using .replace() function)
public class Question6 {
    public static void main(String[] args) {
        String input="Rahul Bhutaiya";
        System.out.println(AnswerQ6.updateString(input,'a','b'));//Rbhul Bhutbiyb
    }
}

class AnswerQ6{
    static String updateString(String s1,char old,char newChar){// T=O(n) S=O(n) Auxiliary=O(n)
        String ans="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=old){
                ans+=s1.charAt(i);
            }else{
                ans+=newChar;
            }
        }
        return ans;
    }
}
