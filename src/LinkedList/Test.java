package LinkedList;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();


        l1.insert(10);
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(30);
//        l1.delete(10);
        l1.delete(10);
        l1.print();
//        l1.printRev();
    }
}

class LinkedList{
    private Node head,tail;

    public void insert(int num){
        Node newNode=new Node(num);

        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void delete(int input){
        if(head==null){
            System.out.println("Linked List is Empty. Can't Delete");
        }
        else if(head.value==input){
            if(head==tail){
                head=tail=null;
            }
            else{
                head=head.next;
            }
        }
        else{
            Node temp = head;

            while (temp.next!=null){
                if(temp.next.value==input){
                    if(temp.next==tail){
                        temp.next=null;
                        tail=temp;
                    }
                    else{
                        temp.next=temp.next.next;
                    }
                    continue;
                }
                temp=temp.next;
            }
            System.out.println("Element Doesn't Exists");
        }
    }

    public void print(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public boolean find(int num){
        Node temp=head;

        while (temp!=null){
            if(temp.value==num){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public void printRev(){
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

class Node{
    int value;
    Node next;

    public Node(int num){
        this.value=num;
    }
}
