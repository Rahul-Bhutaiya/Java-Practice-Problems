package Queue;

import javax.swing.*;

// Simple Queue using Array
public class SimpleQueue {
    public static void main(String[] args) {
        demo queue1 = new demo(5);

        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.enqueue(40);
        queue1.enqueue(50);

        queue1.deQueue();
//        queue1.deQueue();
//        queue1.deQueue();
        System.out.println(queue1.peek());
        queue1.print();
        System.out.println(queue1.size());
    }
}

class demo{
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public demo(int size){
        capacity=size;
        this.queue=new int[size];
        this.front=-1;
        this.rear=-1;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        queue[rear]=value;
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        front++;
        int removed= queue[front];

        if(front==rear){
            front=rear=-1;
        }
        return removed;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front+1;i<=rear;i++){
            System.out.print(queue[i] + " ");
        }
    }

    public int size(){
        return ((rear+1)-(front+1));
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front+1];
    }

    public boolean isEmpty(){
        return rear==-1;
    }
    public boolean isFull(){
        return rear==capacity-1;
    }
}
