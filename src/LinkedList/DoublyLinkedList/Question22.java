package LinkedList.DoublyLinkedList;

//Remove duplicates from doubly linked list - not sorted
public class Question22 {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert(10);
        dl.insert(10);
        dl.insert(5);
        dl.insert(20);
        dl.insert(5);
        dl.insert(5);
        dl.insert(10);
        dl.insert(30);
        dl.insert(30);
        dl.insert(30);

        dl.print();
        dl.printRev();

        Node[] nodeArr=removeDuplicates(dl.getHead(),dl.getTail());
        dl.setHead(nodeArr[0]);
        dl.setTail(nodeArr[1]);

        dl.print();
        dl.printRev();
    }

//    Time=> O(N*N)
    public static Node[] removeDuplicates(Node head,Node tail){
        if(head==null){
            System.out.println("Doubly Linked list is empty");
            return new Node[]{null,null};
        }

        if(head.next==null){
            System.out.println("There is only single element in DoublyLinkedList");
            return new Node[]{head,tail};
        }

        Node current=head;
        while (current!=null && current.next!=null){
            Node next=current.next;
            while (next!=null){
                if(next.data==current.data){
                    Node nextNode=next.next;
                    Node prevNode=next.prev;
                    next.next=null;
                    next.prev=null;
                    prevNode.next=nextNode;
                    if(nextNode!=null){
                        nextNode.prev=prevNode;
                    }
                    else{
                        tail=prevNode;
                    }
                    next=nextNode;
                }
                else{
                    next=next.next;
                }
            }
            current=current.next;
        }
        return new Node[]{head,tail};
    }
}
