package Stack.StackUsingCollectionFramework;

import java.util.Stack;

public class Question7 {
    public static void main(String[] args) {
        String postFixExpression="ab+cd-e+*";
        System.out.println(getInfixFromPostfix(postFixExpression));
    }
    public static String getInfixFromPostfix(String postfix){
        Stack<String> stack=new Stack<>();
        for(char eachChar:postfix.toCharArray()){
            if(isOperator(eachChar)){
                if(stack.size()<2){
                    System.out.println("Invalid PostFix Expression");
                    return "";
                }
                String right=stack.pop();
                String left=stack.pop();
                stack.push("("+left+eachChar+right+")");
            }
            else{
                stack.push(String.valueOf(eachChar));
            }
        }
        if(stack.size()!=1){
            System.out.println("Invalid PostFix Expression");
            return "";
        }
        return stack.pop();
    }
    public static boolean isOperator(char ch){
        return (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%');
    }
}
