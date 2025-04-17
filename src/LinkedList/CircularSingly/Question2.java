package LinkedList.CircularSingly;

//Check if linked list is circular linked list
 class Question2 {
    public static void main(String[] args) {
        CircularSingly obj1=new CircularSingly();

//        obj1.insert(10);
//        obj1.insert(20);
        obj1.insert(30);
        System.out.println(isCircularSingly(obj1.getHead()));

    }

    static boolean isCircularSingly(Node head){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return false;
        }

        Node current=head;
        do{
            current=current.next;
        }while (current!=null && current!=head);

        return  current==head;
    }
}
