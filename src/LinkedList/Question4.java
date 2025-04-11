package LinkedList;

// Get nth node in linked list
public class Question4 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        System.out.println(getNthNodeValue(4,ll.getHead()));
    }

    public static int getNthNodeValue(int n, Node head){
        int count=1;
        while (head!=null){
            if(count==n){
                return head.value;
            }
            head=head.next;
            count++;
        }
        System.out.println("Invalid Length Input");
        return -1;
    }
}
