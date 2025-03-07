package String.Assignment;

public class Question8 {
    public static void main(String[] args) {
        AnswerQ8.getFreqCount("Sallu Bhai");
    }
}

class AnswerQ8{
    static void getFreqCount(String s1){
        int[] arr=new int[128];

        for(int i=0;i<s1.length();i++){
//            char c=s1.charAt(i);
//            arr[(int)c]++;
            int asciiValue=s1.charAt(i);
            arr[asciiValue]++;
        }

        //more optimized
        for(int i=0;i<128;i++){
            if(arr[i]>0){
                System.out.println((char)i +"->"+ arr[i]);
            }
        }

        //less optimized
//        for(int i=0;i<s1.length();i++){
//            char c=s1.charAt(i);
//            System.out.println(c + "-> " + arr[(int)c]);
//        }
    }
}
