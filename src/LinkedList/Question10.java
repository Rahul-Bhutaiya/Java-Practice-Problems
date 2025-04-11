package LinkedList;

//Remove duplicates from a sorted linked list
public class Question10 {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.insert(10);
        ll.insert(10);
        ll.insert(20);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(40);
        ll.insert(50);
        ll.insert(50);

        ll.print();
        removeDuplicate(ll.getHead());
        ll.print();
    }

    public static void removeDuplicate(Node head){
        if(head==null){
            System.out.println("Your Linked List is Empty");
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
                Node temp2=temp.next.next;
                temp.next.next=null;
                temp.next=temp2;
            }
            else{
                temp=temp.next;
            }
        }
    }
}
