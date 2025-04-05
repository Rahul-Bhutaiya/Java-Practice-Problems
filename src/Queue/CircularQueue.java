package Queue;

public class CircularQueue {
    public static void main(String[] args) {
        demoTest d1=new demoTest(5);

        d1.enqueue(10);
        d1.enqueue(20);
        d1.enqueue(30);
        d1.enqueue(40);
        d1.enqueue(50);
        d1.dequeue();
        d1.dequeue();
        d1.enqueue(60);
        d1.enqueue(70);
        d1.print();
    }
}

class demoTest{
    private int[] queue;
    private int front;
    private int rear;
    private int length;

    public demoTest(int size){
        length=size;
        queue=new int[size];
        front=-1;
        rear=-1;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }

        if(front==-1){
            front=0;// Because If front is at -1 then I can't check that is Queue is full or not
        }

        rear=(rear+1)%length;
        queue[rear]=value;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int removedVal=queue[front];

        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%length;
        }

        return removedVal;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is full");
            return;
        }
        int i=front;
        while (true){
            System.out.print(queue[i]+ " ");
            if(i==rear){
                break;
            }
            i=(i+1)%length;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is full");
            return -1;
        }
        return queue[front];
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else if (rear >= front) {
            return rear - front + 1;
        } else {
            return length - front + rear + 1;
        }
    }


    public boolean isEmpty(){
        return (rear==-1);
    }

    public boolean isFull(){
        return ((rear+1)%length)==front;
    }
}