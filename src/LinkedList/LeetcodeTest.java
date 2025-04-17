package LinkedList;

public class LeetcodeTest {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(7);
        ll.insert(7);
        ll.insert(7);
        ll.insert(7);

        ll.print();
        Solution s1=new Solution();
        ll.setHead(s1.removeElements(ll.getHead(),7));
        ll.print();
    }


}

class Solution {
    public Node removeElements(Node head, int val) {
        if(head==null){
            return head;
        }
        if(head.value==val){
            if(head.next==null){
                head=null;
                return head;
            }
            else{
                Node temp=head.next;
                head.next=null;
                head=temp;
                head=removeElements(head,val);
            }
        }
        else{
            Node temp=head;

            while(temp.next!=null){
                if(temp.next.value==val){
                    Node temp2 = temp.next.next;
                    temp.next.next=null;
                    temp.next=temp2;
                }
                else{
                    temp=temp.next;
                }
            }
            return head;
        }
        return head;
    }
}
