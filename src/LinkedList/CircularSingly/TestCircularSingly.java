package LinkedList.CircularSingly;

public class TestCircularSingly {
    public static void main(String[] args) {
        CircularSingly obj1=new CircularSingly();
        obj1.insert(10);
        obj1.insert(20);
        obj1.insert(30);
        obj1.insert(40);
        obj1.print();
    }
}

class CircularSingly{
    private Node head;

    public void insert(int num){
        Node newNode = new Node(num);

        if(head==null){
            head=newNode;
            head.next=head;
        }
        else{
            Node current=head;

            while (current.next!=head){
                current=current.next;
            }
            current.next=newNode;
            newNode.next=head;
        }
    }

    public void print(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node current=head;
        do{
            System.out.print(current.data + " ");
            current=current.next;
        }while (current!=head);
        System.out.println();
    }

    public Node getHead(){
        return this.head;
    }

    public void setHead(Node newHead){
        this.head=newHead;
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}
