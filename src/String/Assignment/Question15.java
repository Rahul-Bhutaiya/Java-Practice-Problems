package String.Assignment;

//Check if string have equal digits and chars // hello12387
public class Question15 {
    public static void main(String[] args) {
        String input="hello123342 ";
        System.out.println(AnswerQ15.checkEquality(input));
    }
}

class AnswerQ15{
    static boolean checkEquality(String input){
        int digitCount=0,charCount=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch>=48 && ch<=57){
                digitCount++;
            } else {
                charCount++;
            }
        }
        return digitCount==charCount;
    }
}
//T=O(n)
//S=O(1)