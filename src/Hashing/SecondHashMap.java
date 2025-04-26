package Hashing;

import java.util.HashMap;
import java.util.Objects;

public class SecondHashMap {
    public static void main(String[] args) {
        HashMap<Person2,String > hashMap = new HashMap<>();

        Person2 p1 = new Person2(10,"Ramesh");
        Person2 p2 = new Person2(20,"Suresh");
        Person2 p3 = new Person2(20,"Suresh");

        hashMap.put(p1,"Manager");
        hashMap.put(p2,"HR");
        System.out.println(hashMap);
        hashMap.put(p3,"Employee");
        System.out.println(hashMap);
    }
}

class Person2{
    private int id;
    private String name;

    public Person2(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }

    //Deep Comparison
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
        Person2 input = (Person2)obj;
        return this.id==input.id && Objects.equals(this.name,input.name);
    }

    @Override
    public String toString() {
        return "id : "+id+", name : "+name;
    }


}
