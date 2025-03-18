package Stack.StackUsingCollectionFramework;

import java.util.Stack;
//Check if string is palindrome or not using stack
public class Question1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("sarras"));
    }
    public static boolean isPalindrome(String input){
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<input.length()/2;i++){
            s1.push(input.charAt(i));
        }
        int start=(input.length()%2==0)?input.length()/2:(input.length()/2)+1;
        for(int i=start;i<input.length();i++){
            if(s1.pop()!=input.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
