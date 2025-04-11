package LinkedList;

//Detect loop in linked list
public class Question8 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insertLoop(30);
        System.out.println(detectLoop(ll.getHead()));
    }

    public static boolean detectLoop(Node head){
        Node slow=head;
        Node fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
