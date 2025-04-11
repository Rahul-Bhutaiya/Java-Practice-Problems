package LinkedList;

//Reverse a linked list (change all the pointer and head)
public class Question11 {
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);

        ll.print();
        Node newHead = reverseLinkedList(ll.getHead());
        ll.setHead(newHead);
        ll.print();

    }

    public static Node reverseLinkedList(Node head){
        Node prev=null;
        Node cur=head;

        while (cur!=null){
            Node next=cur.next;
            cur.next=prev;

            prev=cur;
            cur=next;
        }

        head=prev;
        return head;
    }
}
