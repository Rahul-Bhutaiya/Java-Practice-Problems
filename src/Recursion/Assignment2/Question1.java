package Recursion.Assignment2;

//Check if a string is a palindrome
public class Question1 {
    public static void main(String[] args) {
        String s = "karas";
//        System.out.println(isPalindrome(s,0,s.length()-1));
        System.out.println(isPalindrome2(s,0));
    }
    public static boolean isPalindrome(String s, int start, int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return isPalindrome(s,start+1,end-1);
    }

    public static boolean isPalindrome2(String s,int index){
        int rightIndex = s.length()-1-index;
        if(index>=rightIndex){
            return true;
        }
        if(s.charAt(index)!=s.charAt(rightIndex)){
            return false;
        }
        return isPalindrome2(s,index+1);

    }
}
