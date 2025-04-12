package LinkedList;


public class Test {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();


        l1.insert(20);
        l1.insert(20);
        l1.insert(10);
        l1.insert(30);
        l1.insert(10);
        l1.insert(10);
        l1.insert(20);
        l1.print();
        l1.delete(20);
        l1.print();
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
            System.out.println("Linked List is Empty.");
        }
        else if(head.value==input){
            if(head==tail){
                head=tail=null;
            }
            else{
                Node temp=head.next;
                head.next=null;
                head=temp;
                delete(input);
            }
        }
        else{
            boolean isDeleted=false;
            Node temp = head;

            while (temp.next!=null){
                if(temp.next.value==input){
                    if(temp.next==tail){
                        temp.next=null;
                        tail=temp;
                        isDeleted=true;
                    }
                    else{
                        Node temp2=temp.next.next;
                        temp.next.next=null;
                        temp.next=temp2;
                        isDeleted=true;
                    }
                    continue;
                }
                temp=temp.next;
            }
            if(!isDeleted) {
                System.out.println("Element Doesn't Exists");
            }
        }
    }

    public void print(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public boolean find(int num){
        if(head==null){
            System.out.println("Linked List is Empty");
            return false;
        }
        Node temp=head;
        while (temp!=null){
            if(temp.value==num){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public Node search(int num){
        if(head==null){
            System.out.println("Your LinkedList is Empty");
            return new Node();
        }
        if(head.value==num){
            return head;
        }
        Node temp = head;
        while (temp.next!=null){
            if(temp.next.value==num){
                return temp.next;
            }
            temp=temp.next;
        }
        System.out.println("Element does not exists");
        return new Node();
    }

    public void update(int oldValue, int newValue){
        Node temp=head;
        boolean isExists=false;

        while (temp!=null){
            if(temp.value==oldValue){
                temp.value=newValue;
                isExists=true;
            }
            temp=temp.next;
        }
        if(!isExists){
            System.out.println("Old Value Doesn't Exists");
        }
    }

    public Node getHead(){
        return head;
    }

    public void setHead(Node newHead){
        this.head=newHead;
    }

    public boolean insertLoop(int num){
        if(head==null) return false;

        if(head.value==num){
            tail.next=head;
            return true;
        }
        Node temp = head;

        while (temp.next!=null){
            if(temp.next.value==num){
                tail.next=temp.next;
                return true;
            }
            temp=temp.next;
        }
        return false;

    }

}

class Node{
    int value;
    Node next;

    public Node(){}

    public Node(int num){
        this.value=num;
    }
}
