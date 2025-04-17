package LinkedList.DoublyLinkedList;


public class DoublyLinkedList {
    private Node head,tail;

    public void insert(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    public void print(){
        if(head==null){
            System.out.println("DoublyLinkedList is Empty");
            return;
        }

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void printRev(){
        if(head==null){
            System.out.println("DoublyLinkedList is Empty");
            return;
        }

        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public Node delete(int num){
        if(head==null){
            System.out.println("DoublyLinkedList is Empty");
            return null;
        }
        if(head.data==num){
            if(head==tail){
                head=tail=null;
            }
            else{
                head=head.next;
                head.prev.next=null;
                head.prev=null;
                head = delete(num);
            }
        }
        else{
            Node temp=head;

            while (temp.next!=null){
                if(temp.next.data==num){
                    if(temp.next==tail){
                        tail.prev=null;
                        temp.next=null;
                        tail=temp;
                    }
                    else{
                        Node temp2=temp.next.next;
                        temp.next.next=null;
                        temp.next.prev=null;
                        temp.next=temp2;
                        temp2.prev=temp;
                    }
                }
                else{
                    temp=temp.next;
                }
            }
        }
        return head;
    }

    public Node search(int data){
        if(head==null){
            System.out.println("Doubly Linked list is empty");
            return null;
        }
        Node temp=head;

        while (temp!=null){
            if(temp.data==data){
                return temp;
            }
            temp=temp.next;
        }
        System.out.println("Data does not exists in Doubly linked list");
        return null;
    }

    public void makeCircular(){
        if(head==null){
            System.out.println("Doubly Linked List is Empty");
            return;
        }
        tail.next=head;
        head.prev=tail;
    }

    public void printCircular(){
        if(head==null){
            System.out.println("Doubly Linked List is Empty");
            return;
        }

        Node current=head;
        do{
            System.out.print(current.data + " ");
            current=current.next;
        }while (current!=head);
        System.out.println();
    }

    public void printReverseCircular(){
        if(tail==null){
            System.out.println("Doubly Linked List is Empty");
            return;
        }

        Node current=tail;
        do{
            System.out.print(current.data + " ");
            current=current.prev;
        }while (current!=tail);
        System.out.println();
    }

    public void setHead(Node head){
        this.head=head;
    }
    public void setTail(Node tail){
        this.tail=tail;
    }

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }
}


