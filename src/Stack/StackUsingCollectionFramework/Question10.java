package Stack.StackUsingCollectionFramework;

import java.util.Stack;

//Remove All Adjacent Duplicates In String - Input: “abbaca” output: “ca”
public class Question10 {
    public static void main(String[] args) {
        String s="abbaca";
//        String s="abbbaacd";
        Stack<Character> stack=new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(stack.isEmpty()||stack.peek()!=ch){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
