package LinkedList.DoublyLinkedList;

//Insert value in sorted doubly linked list
public class Question18 {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);
        dl.insert(50);

        dl.print();
        dl.printRev();

        Node[] nodeArr=insertInSortedDoubly(dl.getHead(),dl.getTail(),500);

        dl.setHead(nodeArr[0]);
        dl.setTail(nodeArr[1]);

        dl.print();
        dl.printRev();
    }

    public static Node[] insertInSortedDoubly(Node head,Node tail,int number){
        Node newNode = new Node(number);

        Node current=head;

        while (current!=null){
            if(current.data>=number){
                if(current==head){
                    newNode.next=current;
                    current.prev=newNode;
                    return new Node[]{newNode,tail};
                }
                Node previous=current.prev;
                previous.next=newNode;
                newNode.prev=previous;
                newNode.next=current;
                current.prev=newNode;
                return new Node[]{head,tail};
            }

            if(current.next==null){
                current.next=newNode;
                newNode.prev=current;
                return new Node[]{head,newNode};
            }
            current=current.next;
        }
        return new Node[]{newNode,newNode};
    }
}
