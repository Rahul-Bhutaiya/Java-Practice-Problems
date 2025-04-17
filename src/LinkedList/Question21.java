package LinkedList;

//Remove duplicates from singly linked list – not sorted
public class Question21 {
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.insert(10);
//        ll.insert(10);
        ll.insert(5);
        ll.insert(5);
        ll.insert(5);
        ll.insert(20);
        ll.insert(10);
//        ll.insert(5);
//        ll.insert(10);
        ll.insert(30);
        ll.insert(30);
        ll.insert(30);

        ll.print();

        removeDuplicates(ll.getHead());

        ll.print();
    }

//    Time => O(N*N)
    public static void removeDuplicates(Node head){
        if(head==null){
            System.out.println("LinkedList is Empyt");
            return;
        }

        if(head.next==null){
            System.out.println("There is only single element in LinkedList");
            return;
        }

        Node current =head;
        while (current!=null && current.next!=null){
            Node next=current.next;
            Node prev=current;
            while (next!=null){
                if(next.value==current.value){
                    Node temp=next.next;
                    next.next=null;
                    prev.next=temp;
                    next=temp;
                }
                else{
                    next=next.next;
                    prev=prev.next;
                }
            }

            current=current.next;
        }
    }
}
