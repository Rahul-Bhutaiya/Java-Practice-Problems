package String.Assignment;

public class Question13 {
    public static void main(String[] args) {
        String s1="Rahul",s2="Rohit";
        System.out.println(AnswerQ13.getMergedString(s1,s2));//RRaohhuilt
    }
}

class AnswerQ13{
    static String getMergedString(String s1,String s2){
        int s1Length=s1.length(),s2Length=s2.length();
        int index=0;
        char[] charArr=new char[s1Length+s2Length]; //S=O(n)

        for(int i=0;i<s1Length;i++){ //T=O(n)
            char s1Char=s1.charAt(i),s2Char=s2.charAt(i);
            charArr[index]=s1Char;
            index++;
            charArr[index]=s2Char;
            index++;
        }

        return new String(charArr);
    }
}
//T=O(n)
//S=O(n)