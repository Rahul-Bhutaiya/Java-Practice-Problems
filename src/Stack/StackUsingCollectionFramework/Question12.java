package Stack.StackUsingCollectionFramework;

import java.util.Stack;

//Monotonic Stack
public class Question12 {
    public static void main(String[] args) {
//        IncreasingMonotonicStack obj1=new IncreasingMonotonicStack();
//        obj1.push(10);
//        obj1.push(15);
//        obj1.push(20);
//        obj1.push(2);
//        obj1.push(14);
//        obj1.push(50);
//        obj1.push(-50);
//        obj1.print();//[-50, 2, 10, 14, 15, 20, 50]

//        DecreasingMonotonicStack stack=new DecreasingMonotonicStack();
//        stack.push(50);
//        stack.push(40);
//        stack.push(20);
//        stack.push(40);
//        stack.print();
    }
}

//Increasing Monotonic Stack
class IncreasingMonotonicStack{
    private Stack<Integer> stack;
    public IncreasingMonotonicStack(){
        stack=new Stack<>();
    }

    public void push(int num){
        if(stack.isEmpty()){
            stack.push(num);
        }
        else if(stack.peek()<=num){
            stack.push(num);
        }
        else{
            Stack<Integer> tempStack=new Stack<>();

            while (!stack.isEmpty() && stack.peek()>num){
                tempStack.push(stack.pop());
            }

            stack.push(num);

            while (!tempStack.isEmpty()){
                stack.push(tempStack.pop());
            }
        }
    }

    public int pop(){
        return stack.pop();
    }

    public int peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void print(){
        System.out.println(stack);
    }
}

//Decreasing Monotonic Stack
class DecreasingMonotonicStack{
    private Stack<Integer> stack;

    public DecreasingMonotonicStack(){
        stack=new Stack<>();
    }

    public void push(int num){
        if(stack.isEmpty()){
            stack.push(num);
        }
        else if(stack.peek()>=num){
            stack.push(num);
        }
        else{
            Stack<Integer> tempStack = new Stack<>();

            while (!stack.isEmpty() && stack.peek()<num){
                tempStack.push(stack.pop());
            }
            stack.push(num);
            while (!tempStack.isEmpty()){
                stack.push(tempStack.pop());
            }
        }
    }

    public int pop(){
        return stack.pop();
    }

    public int peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void print(){
        System.out.println(stack);
    }
}