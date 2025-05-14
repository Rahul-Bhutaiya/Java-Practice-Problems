package Stack.StackUsingCollectionFramework;

import java.util.Stack;

public class Question9 {
    public static void main(String[] args) {
//        String postFix="ab+cd-e+*";
        String postFix="ab+cd-*";

        System.out.println(getPrefixFromPostFix(postFix));
    }
    public static String getPrefixFromPostFix(String postFix){
        Stack<String> stack = new Stack<>();
        for(char eachChar:postFix.toCharArray()){
            if(isOperator(eachChar)){
                if(stack.size()<2){
                    System.out.println("Invalid PostFix Expression");
                    return "";
                }
                String right=stack.pop();
                String left=stack.pop();
                stack.push(eachChar+left+right);
            }
            else{
                stack.push(eachChar+"");
            }
        }
        if(stack.size()!=1){
            System.out.println("Invalid Postfix Expression");
            return "";
        }
        return stack.pop();
    }
    public static boolean isOperator(char ch){
        return (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%');
    }
}
