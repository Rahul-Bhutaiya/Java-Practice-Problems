package String.Assignment;

//Remove All Digits from given string
public class Question10 {
    public static void main(String[] args) {
        String s1="H1ello2 3h3ow 63are 100you2";
        System.out.println(AnswerQ10.removeDigits(s1));//Hello how are you
    }
}
class AnswerQ10{
    static String removeDigits(String s1){
        int asciiDigitStarts='0';
        int asciiDigitends='9';
        String result="";//S->O(n)

        for(int i=0;i<s1.length();i++){//T->O(n)
            char ch=s1.charAt(i);
            if(ch>=asciiDigitStarts && ch<=asciiDigitends){
                continue;
            }
            result+=ch;
        }
        return result;
    }
}
//T=O(n)
// S=O(n) //space will be O(n*n) internally because every time new string object will created while concatenation
