package String.Assignment;

//find duplicate chars from string
public class Question12 {
    public static void main(String[] args) {
        String input="Rahul BhutaiyaB";
        AnswerQ12.displayDuplicateCharsInString(input);
    }
}

class AnswerQ12{
    static void displayDuplicateCharsInString(String s1){
        int[] ascArr=new int[128];

        for(int i=0;i<s1.length();i++){//T=O(n)
            int ascIndex=s1.charAt(i);
            ascArr[ascIndex]++;
        }

        for(int i=0;i<128;i++){//T=O(1)
            if(ascArr[i]>1){
                System.out.print((char)i+" ");
            }
        }
    }
}

//T=O(n)
//S=O(n)
//Auxiliary=O(1)