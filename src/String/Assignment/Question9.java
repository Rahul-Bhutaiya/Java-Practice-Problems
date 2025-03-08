package String.Assignment;


//Remove Vowels from a String
public class Question9 {
    public static void main(String[] args) {
        String name="Rahul Bhutaiya";
        System.out.println(AnswerQ9.removeVowels(name));
    }
}

class AnswerQ9{
    public static String removeVowels(String s1){
        String result=""; //S->O(n)
        for(int i=0;i<s1.length();i++){//T->O(n)
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                continue;
            }
            result+=ch;
        }
        return result;
    }
}
//T=O(n)
//S=O(n) //space will be O(n*n) internally because every time new string object will created while concatenation