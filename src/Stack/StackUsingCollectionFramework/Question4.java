package Stack.StackUsingCollectionFramework;

import java.util.Stack;

//getMin() in O(1) time and O(1) extra space
public class Question4 {
    public static void main(String[] args) {
        GetMinOptimized stack1=new GetMinOptimized();
        stack1.push(5);
        stack1.push(3);
        stack1.push(4);
        stack1.push(-7);
        stack1.push(1);
        stack1.push(9);
        System.out.println(stack1.getMin());//-7
        stack1.pop();
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.getMin());//3
        System.out.println(stack1.peek());//4
    }
}

class GetMinOptimized{
    private int minValue;
    private Stack<Integer> stack;

    GetMinOptimized(){
        stack=new Stack<>();
    }

    public void push(int num){
        if(stack.isEmpty()){
            minValue=num;
            stack.push(num);
        }
        else if(num<minValue){
            stack.push(2*num-minValue);
            minValue=num;
        }
        else{
            stack.push(num);
        }
    }
    public int pop(){
        int poppedValue= stack.pop();
        if(poppedValue<minValue){
            //getting previous min
            int min=minValue;
            minValue=2*min-poppedValue;
            return min;
        }
        return poppedValue;
    }
    public int peek(){
        int peek=stack.peek();
        if(peek<minValue){
            return minValue;
        }
        return peek;
    }
    public int getMin(){
        return minValue;
    }
}
