package LinkedList;

//Count nodes / length of linked list
public class Question2 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();

        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        System.out.println(getLength(ll.getHead()));
    }

//    Time = O(N)
    static int getLength(Node head){
        int counter=0;

        while (head!=null){
            counter++;
            head=head.next;
        }
        return counter;
    }
}
