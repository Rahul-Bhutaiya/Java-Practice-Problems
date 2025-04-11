package LinkedList;

// Print middle node of the linked list (Single scan / loop)
public class Question7 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);

        System.out.println(getMiddle(ll.getHead()));
    }

    public static int getMiddle(Node head){
        Node slow=head;
        Node fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.value;
    }
}
