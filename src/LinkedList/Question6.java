package LinkedList;

public class Question6 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.print();
        deleteNode2(l1.search(30));
        l1.print();
    }

    // Time -> O(N)
    public static void deleteNode2(Node del){
       while (del.next.next!=null){
           del.value=del.next.value;
           del=del.next;
       }
       del.value=del.next.value;
       del.next=null;
    }

    // Time -> O(1)
    public static void deleteNode(Node del){
        del.value=del.next.value;
        Node temp = del.next.next;
        del.next.next=null;
        del.next=temp;
    }
}
