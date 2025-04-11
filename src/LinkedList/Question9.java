package LinkedList;

//Find length of loop in linked list
public class Question9 {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.insert(70);
        ll.insert(80);


        ll.insertLoop(20);
        System.out.println(getLengthOfLoop(ll.getHead()));
    }

    public static int getLengthOfLoop(Node head){
        Node slow=head;
        Node fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                int counter=1;
                Node temp=slow.next;
                while (temp!=fast){
                    counter++;
                    temp=temp.next;
                }
                return counter;
            }
        }
        System.out.println("Loop Doesn't Exists");
        return -1;
    }
}
