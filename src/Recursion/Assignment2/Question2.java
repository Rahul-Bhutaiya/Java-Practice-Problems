package Recursion.Assignment2;

//Reverse a string
public class Question2 {
    public static void main(String[] args) {
//        String s = "rahul bhutaiya ";
        String s = "";
        StringBuilder sb = new StringBuilder();
        System.out.println(reverseString(s,sb,0));
    }
    public static StringBuilder reverseString(String s,StringBuilder sb, int index){
        if(index==s.length()){
            return sb;
        }
        sb = reverseString(s,sb,index+1);
        return sb.append(s.charAt(index));
    }
}
