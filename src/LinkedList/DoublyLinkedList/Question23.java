package LinkedList.DoublyLinkedList;

//[Circular Doubly LL] Exchange first and last nodes
public class Question23 {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);


        dl.makeCircular();

        dl.printCircular();
        dl.printReverseCircular();

        Node[] nodeArr=exchangeFirstandLastOfCircularDoubly(dl.getHead(),dl.getTail());

        dl.setHead(nodeArr[0]);
        dl.setTail(nodeArr[1]);

        dl.printCircular();
        dl.printReverseCircular();
    }

    public static Node[] exchangeFirstandLastOfCircularDoubly(Node head, Node tail){
        if(head==null){
            System.out.println("Doubly Linked List is Empty");
            return new Node[]{null,null};
        }

        if(head==tail){
            System.out.println("Doubly Linked List has only One Node. Can't Exchange");
            return new Node[]{head,tail};
        }

        if(head.next.next==head){
            return new Node[]{tail,head};
        }

        Node t1=head.next;
        Node t2=tail.prev;

        t1.prev=tail;
        t2.next=head;

        head.next=tail;
        head.prev=t2;

        tail.next=t1;
        tail.prev=head;

        return new Node[]{tail,head};
    }
}
