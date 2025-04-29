package Hashing;

public class LRU_Cache<K,V> {
    DoublyLinkedList<K,V> doublyLinkedList;
    MyHashMap<K,DoublyNode<K,V>> hashMap;
    int capacity;
    int size;

    public LRU_Cache(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.doublyLinkedList = new DoublyLinkedList<>();
        this.hashMap = new MyHashMap<>();
    }

    public V get(K key){
        if(hashMap.get(key)==null){
            return null;
        }
        DoublyNode<K,V> node = hashMap.get(key);
        doublyLinkedList.deleteNode(node);
        doublyLinkedList.insertAfterHead(node);
        return node.value;
    }

    public void put(K key, V value){
        if(hashMap.get(key)!=null){
            DoublyNode<K,V> node = hashMap.get(key);
            node.value=value;
            doublyLinkedList.deleteNode(node);
            doublyLinkedList.insertAfterHead(node);
        }
        else{
            if(this.size==capacity){
                DoublyNode<K,V> lruNode = doublyLinkedList.tail.prev;
                this.hashMap.remove(lruNode.key);
                doublyLinkedList.deleteNode(lruNode);
                this.size--;
            }
            DoublyNode<K,V> newNode = new DoublyNode<>(key,value);
            hashMap.put(key,newNode);
            doublyLinkedList.insertAfterHead(newNode);
            this.size++;
        }
    }

    public void print(){
        DoublyNode<K,V> temp = doublyLinkedList.head.next;

        while (temp.next!=null){
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LRU_Cache<Integer,String> obj1 = new LRU_Cache<>(4);
        obj1.put(10,"A");
        obj1.put(20,"B");
        obj1.put(30,"C");
//        obj1.put(40,"D");
//        obj1.put(50,"E");

        System.out.println(obj1.get(10));

        obj1.print();

    }
}

class DoublyLinkedList<K,V>{
    DoublyNode<K,V> head;
    DoublyNode<K,V> tail;

    public DoublyLinkedList(){
        this.head = new DoublyNode<>();
        this.tail = new DoublyNode<>();

        head.next=tail;
        tail.prev=head;
    }

    public void deleteNode(DoublyNode<K,V> node){
        DoublyNode<K,V> prevNode = node.prev;
        DoublyNode<K,V> nextNode = node.next;

        node.prev=null;
        node.next=null;

        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }

    public void insertAfterHead(DoublyNode<K,V> node){
        DoublyNode<K,V> headNext = head.next;
        head.next=node;
        node.prev= head;
        node.next=headNext;
        headNext.prev=node;
    }
}


class DoublyNode<K,V>{
    DoublyNode<K,V> next;
    DoublyNode<K,V> prev;
    V value;
    K key;

    public DoublyNode(){}
    public DoublyNode(K key,V value){
        this.key=key;
        this.value=value;
    }
}
