package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    private Queue<Integer> queue;
    private Queue<Integer> tempQueue;

    public StackUsingQueues(){
        queue=new LinkedList<>();
        tempQueue=new LinkedList<>();
    }

    public static void main(String[] args) {
        StackUsingQueues s1=new StackUsingQueues();
        s1.insertLower(10);
        s1.insertLower(20);
        s1.insertLower(30);
        s1.insertLower(40);
        s1.deleteHeavy();
        s1.deleteHeavy();
        s1.deleteHeavy();
        s1.deleteHeavy();
        s1.deleteHeavy();
        s1.print();
    }

    public void insertLower(int value){
//        queue.offer(value);
        queue.add(value);
    }

    public int deleteHeavy(){
        if(queue.isEmpty()){
            System.out.println("Stack is Underflow");
            return -1;
        }
        while (queue.size()!=1){
            tempQueue.add(queue.remove());
        }
        int removedElement = queue.remove();

        while (!tempQueue.isEmpty()){
            queue.add(tempQueue.remove());
        }
        return removedElement;
    }

    public void print(){
        System.out.println(queue);
    }


}


