package Stack.StackUsingCollectionFramework;

import java.util.Stack;

//Check for Balanced parentheses in an expression
public class Question5 {
    public static void main(String[] args) {
//        System.out.println(isBalanced("(){([[]{}()()])}"));
        System.out.println(isBalanced("{}{"));
    }

    public static boolean isBalanced(String input){
        Stack<Character> st1=new Stack<>();

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){
                st1.push(ch);
            }
            else{
                if(st1.isEmpty()){
                    return false;
                }
                char recentStart=st1.pop();
                if(!isMatchingPair(recentStart,ch)){
                    return false;
                }
            }
        }
        return st1.isEmpty();
    }
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}

