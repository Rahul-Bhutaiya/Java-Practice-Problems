package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DesignHashMap {
    public static void main(String[] args) {

        HashMap2<Person,String> hashMap2 = new HashMap2<>();
        Person p1=new Person(10,"Rahul");
//        Person p2=new Person(11,"meet");
        Person p3=new Person(10,"Rahul");

        hashMap2.put(p1,"Employee");
//        hashMap2.put(p2,"Manager");
        hashMap2.put(p3,"HR");
        hashMap2.printHashMap();


//        System.out.println(p1);
//        hashMap2.put(p1,"HR");

//        System.out.println(hashMap2.getHashCode(p1));
//        System.out.println(hashMap2.getHashCode(p2));
//        System.out.println(hashMap2.getHashCode(p3));


//        hashMap2.put("Rahesh","Engineer");
//        hashMap2.put("sdlfjsld","Engineer");
//        hashMap2.get("Rahesh");

//        hashMap2.put(1,"Rahul");
//        hashMap2.put(2,"Utsav");
//        hashMap2.put(3,"Dax");
//        hashMap2.put(4,"Meet");
//        hashMap2.put(433,"Sahil");
//        hashMap2.put(433,"Urvish");
//        hashMap2.put(433,"Shailesh");
//        hashMap2.put(530,"Urvish");
//        hashMap2.put(529,"Urvish");
//        hashMap2.printHashMap();
    }
}

class Person{
    int id;
    String name;
    Person(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person)obj;
        return this.id==other.getId() && Objects.equals(this.name,other.name);
    }

    @Override
    public String toString() {
        return "id : "+ this.id + ", name : "+this.name;
    }
}

class HashMap2<K,V>{
    private float loadFactor;
    int hashMapLength;
    private int hashMapSize;
    private LinkedList[] hashMapArr;

    public HashMap2(){
        hashMapSize=0;
        hashMapLength=16;
        loadFactor=0.75f;
        hashMapArr = new LinkedList[16];
    }
    public HashMap2(int length){
        hashMapSize=0;
        hashMapLength=length;
        loadFactor=0.75f;
        hashMapArr = new LinkedList[length];
    }
    public HashMap2(int length,float loadFactor){
        hashMapSize=0;
        hashMapLength=length;
        this.loadFactor=loadFactor;
        hashMapArr = new LinkedList[length];
    }

    public void put(K key,V value){
        int hashCode = getHashCode(key);
        int index = getIndex(hashCode);

        if(hashMapArr[index]==null){
            LinkedList<K,V> linkedList = new LinkedList<>();
            linkedList.insert(key,value,hashCode);
            hashMapArr[index]=linkedList;
            hashMapSize++;
//            if(((float) hashMapSize /hashMapArr.length)>=loadFactor){
//
//            }
        }
        else{
            LinkedList<K,V> linkedList = hashMapArr[index];
            linkedList.insert(key,value,hashCode);
        }
    }

    public V get(K key){
        int hashCode = getHashCode(key);
        int index = getIndex(hashCode);

        if(hashMapArr[index]==null){
            return null;
        }
        else{
            Node<K,V> temp = hashMapArr[index].search(key);
            return temp==null ? null : temp.value;
        }
    }

//    private void rehashing(){
//        hashMapLength = hashMapLength*2;
//        LinkedList[] temp = hashMapArr;
//        hashMapArr = new LinkedList[hashMapLength];
//
//        for(int i=0;i<temp.length;i++){
//            if(temp[i]==null) continue;
//
//            LinkedList tempNode = temp[i];
//        }
//    }

    public void printHashMap(){
        for(int i=0;i<hashMapArr.length;i++){
            if(hashMapArr[i]==null) continue;

            hashMapArr[i].printLinkedList();
            System.out.println();
        }
    }

    public int getHashCode(K key){
        return Objects.hash(key);
    }

    public int getIndex(int hashCode){
//        return Math.abs(hashCode%hashMapLength);
        return (hashMapArr.length - 1) & hashCode;
    }

}

class LinkedList<K,V>{
    private int currentThreshHold=0;
    private Node<K,V> head;
    private Node<K,V> tail;
    public void insert(K key, V value,int hashCode){
        Node<K,V> newNode = new Node<>(key,value,hashCode);

        if(head==null){
            head=tail=newNode;
            currentThreshHold++;
        }
        else{
            Node<K,V> temp = search(key);
            if(temp!=null){
                temp.value=value;
            }
            else{
                tail.next=newNode;
                tail=newNode;
                currentThreshHold++;
            }
        }
    }

    public int getThreashHold(){
        return this.currentThreshHold;
    }

    public void printLinkedList(){
        Node<K,V> temp=head;
        while (temp!=null){
            System.out.print(temp.key + " : " + temp.value + " ");
            temp=temp.next;
        }
    }

    public Node<K,V> search(K key){
        Node<K,V> temp=head;
        while (temp!=null){
            if(temp.key==key){
                return temp;
            }
            temp=temp.next;
        }
        return temp;
    }

}

class Node<K,V>{
    int hashCode;
    K key;
    V value;
    Node<K,V> next;

    public Node(K key,V value,int hashCode){
        this.hashCode=hashCode;
        this.key=key;
        this.value=value;
    }
}
