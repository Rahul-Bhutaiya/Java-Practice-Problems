package Stack.StackUsingCollectionFramework;

import java.util.Stack;

//Prefix to Infix Conversion
public class Question6 {
    public static void main(String[] args) {
//        String prefixString="*+ab--cde";
        String prefixString="*+ab-cd";
//        String prefixString="++d";
        System.out.println(getInfixFromPrefix(prefixString));
    }
    public static String getInfixFromPrefix(String infix){
        Stack<String> stack=new Stack<>();

        for(int i=infix.length()-1;i>=0;i--){
            char eachChar=infix.charAt(i);
            if(isOperator(eachChar)){
                if (stack.size() < 2) {
                    System.out.println("Invalid Prefix Expression");
                    return "";
                }
                String left=stack.pop();
                String right=stack.pop();
                stack.push("("+left+eachChar+right+")");
            }
            else{
                stack.push(eachChar+"");//converting character to string
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
