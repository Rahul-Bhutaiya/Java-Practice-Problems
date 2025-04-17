package LinkedList.DoublyLinkedList;

//Find pairs with given sum in sorted doubly linked list
public class Question16 {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);
        dl.insert(50);

        System.out.println(checkPair(dl.getHead(),dl.getTail(),50));

    }

    public static boolean checkPair(Node head, Node tail, int sum){
        Node left=head;
        Node right=tail;

        while (left!=right){
            int currentSum=left.data + right.data;
            if(currentSum == sum){
                return true;
            }
            else if(currentSum>sum){
                right=right.prev;
            }
            else{
                left=left.next;
            }
        }
        return false;
    }
}
