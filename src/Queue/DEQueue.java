package Queue;

public class DEQueue {
    public static void main(String[] args) {
        DemoDEQueue dq1=new DemoDEQueue(5);
//        dq1.insertFirst(10);
//        dq1.insertFirst(10);
//        dq1.insertFirst(10);
//        dq1.deleteFirst();
//        dq1.deleteLast();
//        dq1.print();
//        System.out.println(dq1.size());
    }
}

class DemoDEQueue{
    private int[] dQueue;
    private int front,rear;

    public DemoDEQueue(int length){
        dQueue=new int[length];
        front=-1;
        rear=-1;
    }

    public int deleteFirst(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int delValue=dQueue[front];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front++;
        }
        return delValue;
    }

    public int deleteLast(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int delValue=dQueue[rear];
        if(front==rear){
            front=rear=-1;
        }
        else{
            rear--;
        }
        return delValue;
    }

    public void insertFirst(int value){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else if(isEmpty()){
            front=rear=0;
            dQueue[front]=value;
        }
        else if(front>0){
            front--;
            dQueue[front]=value;
        }
        else{
            for(int i=rear;i>=front;i--){
                dQueue[i+1]=dQueue[i];
            }
            dQueue[front]=value;
            rear++;
        }
    }

    public void insertLast(int value){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else if(isEmpty()){
            front=rear=0;
            dQueue[rear]=value;
        }
        else if(rear<dQueue.length-1){
            rear++;
            dQueue[rear]=value;
        }
        else{
            for (int i=front;i<=rear;i++){
                dQueue[i-1]=dQueue[i];
            }
            dQueue[rear]=value;
            front--;
        }
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public boolean isFull(){
        return (front==0 && rear==dQueue.length-1);
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(dQueue[i] + " ");
        }
    }

    public int peekFirst(){
        return dQueue[front];
    }

    public int peekLast(){
        return dQueue[rear];
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return ((rear+1)-(front+1))+1;
    }
}

