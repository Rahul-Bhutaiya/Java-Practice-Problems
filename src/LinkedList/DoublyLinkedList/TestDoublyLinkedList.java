package LinkedList.DoublyLinkedList;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert(10);
        dl.insert(10);
        dl.insert(20);
        dl.insert(10);
        dl.insert(30);
        dl.insert(40);
        dl.insert(40);
        dl.insert(50);
        dl.insert(10);

        dl.print();
        dl.printRev();

        dl.delete(10);

        dl.print();
        dl.printRev();
    }
}
