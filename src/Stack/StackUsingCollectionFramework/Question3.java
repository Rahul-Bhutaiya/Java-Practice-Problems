package Stack.StackUsingCollectionFramework;

import java.util.Stack;
//getMin in O(1) time from stack
public class Question3 {
    public static void main(String[] args) {
        getMinValue obj1=new getMinValue();
        obj1.push(10);
        obj1.push(20);
        obj1.push(3);
        obj1.push(3);
        obj1.push(30);
        obj1.push(40);
        System.out.println(obj1.getMin());

        obj1.pop();
        obj1.pop();
        obj1.pop();
        System.out.println(obj1.getMin());
    }
}

class getMinValue{
    Stack<Integer> st1;
    Stack<Integer> minStack;
    public getMinValue(){
        st1=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int inputNum){
        st1.push(inputNum);
        if(minStack.isEmpty() || minStack.peek()>=inputNum){
            minStack.push(inputNum);
        }
    }

    public int pop(){
        int num=st1.pop();
        if(num==minStack.peek()){
            minStack.pop();
        }
        return num;
    }

    public int getMin(){
        return minStack.peek();
    }
}
