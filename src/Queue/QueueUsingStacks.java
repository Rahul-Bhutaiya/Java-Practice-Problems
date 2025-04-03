package Queue;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack;
    private Stack<Integer> tempStack;

    public QueueUsingStacks(){
        stack=new Stack<>();
        tempStack=new Stack<>();
    }

    public void insertLower(int value){
        stack.push(value);
    }

    public int deleteHeavy(){
        while (stack.size()!=1){
            tempStack.push(stack.pop());
        }
        int removed = stack.pop();
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        return removed;
    }

    public void print(){
        System.out.println(stack);
    }

    public void insertHeavy(int value){
        while (!stack.isEmpty()){
            tempStack.push(stack.pop());
        }
        stack.push(value);

        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }

    public int deleteLower(){
        if(stack.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q1=new QueueUsingStacks();

        q1.insertHeavy(10);
        q1.insertHeavy(20);
        q1.insertHeavy(30);
        q1.deleteLower();
        q1.print();

    }
}
