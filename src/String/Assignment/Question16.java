package String.Assignment;

//Remove duplicate chars from string //helloo->helo
public class Question16 {
    public static void main(String[] args) {
        String input="helloo";
        System.out.println(AnswerQ16.getString(input));
    }
}

class AnswerQ16{
    static String getString(String input){
        int[] ascArray=new int[128];
        String ans="";//S=O(n)

        for(int i=0;i<input.length();i++){//T=O(n)
            char ch=input.charAt(i);
            if(ascArray[(int)ch]==0){
                ascArray[(int)ch]++;
                ans+=ch;
            }
        }
        return ans;
    }
}

//T=O(n)
//S=O(n)