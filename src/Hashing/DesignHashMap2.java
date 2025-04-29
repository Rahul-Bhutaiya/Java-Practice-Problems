package Hashing;

import java.util.Objects;

public class DesignHashMap2 {
    public static void main(String[] args) {
//        MyHashMap<Person4,String> hashMap = new MyHashMap<>();
//
//        Person4 p1 =new Person4(10,"Rahul");
//        Person4 p2 =new Person4(20,"Urvish");
//        Person4 p3 =new Person4(10,"Rahul");
//
//        hashMap.put(p1,"Manager");
//        hashMap.put(p2,"HR");
//        hashMap.put(p3,"Employee");
//
//        System.out.println(hashMap.get(p3));
//
//        hashMap.print();

        MyHashMap<Integer,String> hashMap = new MyHashMap<>();
        hashMap.put(11,"Ramesh");
        hashMap.put(20,"Suresh");
        hashMap.put(30,"Suraj");
//        hashMap.put(3430,"Prakash");
//        hashMap.put(22330,"Vishal");
//        hashMap.put(24320,"Bholu");
//        hashMap.put(2540,"Mayank");
//        hashMap.put(26650,"Urvish");
//        hashMap.put(2665430,"Sidharth");
//        hashMap.put(266505645,"Pant");
//        hashMap.put(266505654,"Karan");
//        hashMap.put(26650645,"Keval");
//        hashMap.put(2665045,"Sahil");
//        hashMap.put(26650454,"Shailesh");
//        hashMap.put(26650464,"Mahesh");
//        hashMap.put(266504,"Gaurav");
//        hashMap.put(26650465,"Shubham");
//        hashMap.put(26650490,"dhruv");
//        hashMap.put(1,"naimish");
//        hashMap.put(2665,"gautam");

//        hashMap.print();
//        hashMap.remove(300);
//        System.out.println();
//        hashMap.print();

//        MyHashMap<String,Integer> hashMap = new MyHashMap<>();
//        hashMap.put("Rahul",1);
//        hashMap.put("Urvish",2);
//        hashMap.put("keval",3);
//        hashMap.put("suman",4);
//        hashMap.put("suman",5);
//        hashMap.put("sumansf",6);
//        hashMap.put("sumansfs",10);

//        System.out.println(hashMap.getCurrentSize());
//        System.out.println(hashMap.getArrLength());
//        System.out.println(hashMap.get("keval"));

//        hashMap.print();
    }
}

class MyHashMap<K,V>{
    private Node2<K,V>[] mapArr;
    private float loadFactor;
    private int arrLength;
    private int size;

    public MyHashMap(){
        this.arrLength=16;
        this.loadFactor=0.75f;
        mapArr=new Node2[arrLength];
        this.size=0;
    }

    public MyHashMap(int arrLength){
        this.arrLength=arrLength;
        this.loadFactor=0.75f;
        mapArr=new Node2[arrLength];
        this.size=0;
    }

    public MyHashMap(int arrLength,float loadFactor){
        this.arrLength=arrLength;
        this.loadFactor=loadFactor;
        mapArr=new Node2[arrLength];
        this.size=0;
    }

    public void put(K key, V value){
        int hashCode = getHashCode(key);
        int index = getIndex(hashCode,arrLength);

        if(mapArr[index]==null){
            Node2<K,V> newNode = new Node2<>(key,value,hashCode);
            mapArr[index]=newNode;
            this.size++;
            if(checkIsLoaded(this.size)){
                rehash();
            }
        }
        else{
            Node2<K,V> prev=null;
            Node2<K,V> temp = mapArr[index];
            while (temp!=null){
                if(temp.getKey().equals(key)){
                    temp.setValue(value);
                    return;
                }
                prev=temp;
                temp=temp.getNextNode();
            }
//           if collision happens
            Node2<K,V> newNode = new Node2<>(key,value,hashCode);
            prev.setNextNode(newNode);
            if(checkIsLoaded(this.size)){
                rehash();
            }
        }
    }

    public boolean remove(K key){
        int hashCode = getHashCode(key);
        int index = getIndex(hashCode,arrLength);

        if(mapArr[index]==null){
            return false;
        }
        else{
            Node2<K,V> prev = null;
            Node2<K,V> temp = mapArr[index];

            while (temp!=null){
                if(temp.getKey().equals(key)){
                    Node2<K,V> temp2 = temp.getNextNode();
                    temp.setNextNode(null);
                    if(prev!=null){
                        prev.setNextNode(temp2);
                    }
                    else{
                        mapArr[index] = temp2;
                    }
                    return true;
                }
                prev=temp;
                temp=temp.getNextNode();
            }
            return false;
        }
    }

    private void rehash(){
        this.arrLength = this.arrLength*2;
        Node2<K,V>[] prevMapArr = this.mapArr;
        this.mapArr = new Node2[this.arrLength];
        this.size=0;

        for (Node2<K, V> kvNode2 : prevMapArr) {
            if (kvNode2 == null) continue;

            Node2<K, V> temp = kvNode2;
            while (temp != null) {
                put(temp.getKey(), temp.getValue());
                temp = temp.getNextNode();
            }
        }
    }

    private boolean checkIsLoaded(int currentSize){
        return ((float) currentSize / arrLength) >= loadFactor;
    }

    public void print(){
        for(int i=0;i< this.arrLength;i++){
            if(mapArr[i]==null) continue;

            System.out.print('{');
            Node2<K,V> temp = mapArr[i];
            while (temp!=null){
                System.out.print(temp.getKey() + " = " + temp.getValue() + ", ");
                temp=temp.getNextNode();
            }
            System.out.println('}');
        }
    }

    public V get(K key){
        int hashCode = getHashCode(key);
        int index = getIndex(hashCode,arrLength);

        Node2<K,V> temp = mapArr[index];
        while (temp!=null){
            if(Objects.equals(temp.getKey(),key)){
                return temp.getValue();
            }
            temp=temp.getNextNode();
        }
        return null;
    }

    public static int getHashCode(Object key){
        return key.hashCode();
    }

    public static int getIndex(int hashCode,int arrlength){
        return Math.abs(hashCode%arrlength);
    }

    public int getCurrentSize(){
        return this.size;
    }

    public int getArrLength(){
        return this.arrLength;
    }
}


class Node2<K,V>{
    private final K key;
    private final int hashCode;
    private V value;
    private Node2<K,V> next;

    public Node2(K key,V value,int hashCode){
        this.key=key;
        this.value=value;
        this.hashCode=hashCode;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return this.value;
    }

    public int getHashCode(){
        return this.hashCode;
    }

    public Node2<K,V> getNextNode(){
        return this.next;
    }

    public void setNextNode(Node2<K,V> newNode){
        this.next=newNode;
    }

    public void setValue(V newValue){
        this.value=newValue;
    }
}

class Person4{
    private int id;
    private String name;

    public Person4(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "{id : "+id+", name : "+name+"}";
    }

//    //Deep Comparison
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        else if(obj==null){
            return false;
        }
        else if(this.getClass() != obj.getClass()){
            return false;
        }
        Person4 input = (Person4)obj;
        return this.id==input.getId() && Objects.equals(this.name,input.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.name);
    }
}
