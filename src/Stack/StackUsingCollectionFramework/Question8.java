package Stack.StackUsingCollectionFramework;

import java.util.Stack;

public class Question8 {
    public static void main(String[] args) {
//        String prefix="*+ab+-cde";
        String prefix="*+ab-cd";
        System.out.println(getPostfixFromPrefix(prefix));
    }
    public static String getPostfixFromPrefix(String prefix){
        Stack<String> stack = new Stack<>();

        for(int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);
            if(isOperator(ch)){
                if(stack.size()<2){
                    System.out.println("Invalid Prefix Expression");
                    return "";
                }
                String left=stack.pop();
                String right=stack.pop();
                stack.push(left+right+ch);
            }
            else{
                stack.push(ch+"");
            }
        }
        if(stack.size()!=1){
            System.out.println("Invalid Prefix Expression");
            return "";
        }
        return stack.pop();
    }
    public static boolean isOperator(char ch){
        return (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%');
    }
}
