package LinkedList;

import java.util.Stack;

//Print linked list in reverse
public class Question3 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        printRev(ll.getHead());
    }

    public static void printRev(Node head){
        Stack<Integer> stack=new Stack<>();
        Node temp=head;

        while (temp!=null){
            stack.push(temp.value);
            temp=temp.next;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
