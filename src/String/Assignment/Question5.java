package String.Assignment;

//Program to check if two strings are same or not (without using inbuilt function .equals())
public class Question5 {
    public static void main(String[] args) {
        String s1="Rahul";
        String s2=new String("Rahul");
        System.out.println(AnswerQ5.isEqual(s1,s2));
    }
}

class AnswerQ5{
    public static boolean isEqual(String s1,String s2){ //T = O(n) S= O(1) Auxiliary = O(1)
        if(s1==s2){
            return true;
        }
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}