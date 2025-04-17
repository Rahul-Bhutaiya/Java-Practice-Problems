package LinkedList.DoublyLinkedList;

//Remove duplicates from a sorted doubly linked list
public class Question19 {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert(10);
        dl.insert(20);
        dl.insert(20);
        dl.insert(20);
        dl.insert(50);
        dl.insert(50);


        dl.print();
        dl.printRev();

        Node[] nodeArr = removeDuplicates(dl.getHead(),dl.getTail());
        dl.setHead(nodeArr[0]);
        dl.setTail(nodeArr[1]);

        dl.print();
        dl.printRev();
    }

    public static Node[] removeDuplicates(Node head, Node tail){
        if(head==null){
            System.out.println("Doubly Linked list is empty");
            return new Node[]{null,null};
        }
        Node current=head;

        while(current.next!=null){
            if(current.data==current.next.data){
                if(current.next.next==null){
                    current.next.prev=null;
                    current.next=null;
                    return new Node[]{head,current};
                }
                else{
                    Node temp=current.next.next;
                    current.next.next=null;
                    current.next.prev=null;

                    current.next=temp;
                    temp.prev=current;
                }
            }
            else{
                current=current.next;
            }
        }
        return new Node[]{head,tail};
    }
}
