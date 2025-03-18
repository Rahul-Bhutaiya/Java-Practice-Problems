package Stack.StackUsingCollectionFramework;

import java.util.Stack;

//Delete middle element of a stack
public class Question2 {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        System.out.println(s1);
        Question2.deleteMiddle(s1);
        System.out.println(s1);
    }

    public static void deleteMiddle(Stack<Integer> inputStack){
        Stack<Integer> temp=new Stack<>();
        int inputStackSize=inputStack.size();
        for(int i=0;i<=inputStackSize/2;i++){
            temp.push(inputStack.pop());
        }
        temp.pop();
        int tempStackSize=temp.size();
        for(int i=0;i<tempStackSize;i++){
            inputStack.push(temp.pop());
        }
    }
}
