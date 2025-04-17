package LinkedList.DoublyLinkedList;

//Reverse a Doubly Linked List
public class Question17 {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);
        dl.insert(50);

        dl.print();
        dl.printRev();

        Node newHead = reverseDoubly(dl.getHead());
        dl.setTail(dl.getHead());
        dl.setHead(newHead);

        dl.print();
        dl.printRev();

    }

    public static Node reverseDoubly(Node head){
        Node current=head;
        Node previous=null;

        while (current!=null){
            Node next=current.next;

            current.next=previous;
            current.prev=next;

            previous=current;
            current=next;
        }
        return previous;
    }
}
