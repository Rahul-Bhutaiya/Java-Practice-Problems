package String.Assignment;

//Reverse Words internally in a String // eg. good evening -> doog gnineve
public class Question11 {
    public static void main(String[] args) {
        String input="good morning rahul";
//        System.out.println(AnswerQ11.getReverseString(input));
        System.out.println(AnswerQ11.getReverseString2(input));
    }
}

class AnswerQ11{
    static String getReverseString(String input){//T=O(n) S=O(n)
        String revString="";
        String[] revStringArr;

        for(int i=input.length()-1;i>=0;i--){
            revString+=input.charAt(i);
        }
        revStringArr=revString.split(" ");
        String[] answerArr=new String[revStringArr.length];
        int index=0;
        for(int i=revStringArr.length-1;i>=0;i--){
            answerArr[index]=revStringArr[i];
            index++;
        }
        return String.join(" ",answerArr);
    }

    // below is best approach
    static String getReverseString2(String input){ //T=O(n) S=O(n)
        String[] strArr=input.split(" ");

        for(int i=0;i<strArr.length;i++){
            String str=strArr[i];
            String rev="";
            for(int j=str.length()-1;j>=0;j--){
                rev+=str.charAt(j);
            }
            strArr[i]=rev;
        }
        return String.join(" ",strArr);
    }
}
