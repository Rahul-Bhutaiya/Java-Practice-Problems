package LinkedList.CircularSingly;

//Exchange first and last nodes in Circular Linked List
public class Question3 {
    public static void main(String[] args) {
        CircularSingly obj1=new CircularSingly();
        obj1.insert(10);
        obj1.insert(20);
        obj1.insert(30);
        obj1.insert(40);
        obj1.insert(50);
        obj1.insert(60);
        obj1.insert(70);
        obj1.insert(80);
        obj1.insert(90);
        obj1.insert(100);
        obj1.print();
        Node n1=exchangeNodes(obj1.getHead());
        obj1.setHead(n1);
        obj1.print();
    }

    static Node exchangeNodes(Node head){
        if(head==null || head.next==head){
            System.out.println("Can't Exchange first and last nodes");
            return head;
        }
        if(head.next.next == head){
            return head.next;
        }

        Node cur=head;
        while (cur.next.next!=head){
            cur=cur.next;
        }

        cur.next.next=head.next;
        head.next=cur.next;
        cur.next=head;

        return head.next;
    }
}
