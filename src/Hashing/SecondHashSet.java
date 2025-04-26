package Hashing;

import java.util.HashSet;
import java.util.Objects;

public class SecondHashSet {
    public static void main(String[] args) {
        HashSet<Person3> hashSet = new HashSet<>();

        Person3 p1=new Person3(10,"Rahul");
        Person3 p2=new Person3(20,"Mayank");
        Person3 p3=new Person3(10,"Rahul");

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        System.out.println(hashSet);
    }
}

class Person3{
    private int id;
    private String name;

    public Person3(int id,String name){
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
        Person3 input = (Person3)obj;
        return this.id==input.getId() && Objects.equals(this.name,input.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.name);
    }
}
