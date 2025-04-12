package LinkedList;

//Get nth node from end in linked list
public class Question5 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);

//        System.out.println(getNthNodeValueFromLast(8,ll.getHead()));
        System.out.println(getNthNodeValueFromLast2(4,ll.getHead()));
    }

//    Time => O(N+N)
    public static int getNthNodeValueFromLast(int n, Node head){
        int length=0;
        Node temp=head;
        while (temp!=null){
            length++;
            temp=temp.next;
        }

        int last=length-n+1;
        int start=1;
        while (head!=null){
            if(start==last){
                return head.value;
            }
            start++;
            head=head.next;
        }
        return -1;
    }

//    Time => O(N)
    public static int getNthNodeValueFromLast2(int n,Node head){
        int count=0;

        Node temp1=head;
        Node temp2=head;
        while (temp1!=null){
            count++;
            if(count==n){
                while (temp1.next!=null){
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
                return temp2.value;
            }
            temp1=temp1.next;
        }
        return -1;
    }
}
