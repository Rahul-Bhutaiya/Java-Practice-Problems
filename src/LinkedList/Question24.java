package LinkedList;

//Print alternate nodes of linked list
public class Question24 {
    public static void main(String[] args) {

    }
    public static void printAlternate(Node head){
        Node current=head;

        while (current!=null){
            System.out.print(current.value +  " ");

            if(current.next!=null){
                current=current.next.next;
            }
            else{
                break;
            }
        }
    }

}
