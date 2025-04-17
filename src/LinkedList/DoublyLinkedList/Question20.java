package LinkedList.DoublyLinkedList;

//Given only a pointer to a node to be deleted in a doubly linked list, delete it
public class Question20 {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);
        dl.insert(50);

        dl.print();
        dl.printRev();

        deleteNode(dl.search(40));

        dl.print();
        dl.printRev();
    }

    public static void deleteNode(Node del){
        Node next=del.next;
        Node previous=del.prev;
        del.next=null;
        del.prev=null;
        previous.next=next;
        next.prev=previous;
    }
}
