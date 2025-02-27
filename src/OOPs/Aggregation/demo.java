package OOPs.Aggregation;

public class demo {
    public static void main(String[] args) {
        Person p1=new Person("rahul",22);
        Person p2=new Person("rahul",22,new Address(33,"Sarita","Surat","Gujarat","India",393939));
//        p2.displayPerson();
        p2.displayPersonWithAddress();
    }
}

class Address{

    int houseNo;
    String societyName;
    String city;
    String state;
    String country;
    int pin;

    public Address(int houseNo, String societyName, String city, String state, String country, int pin) {
        this.houseNo = houseNo;
        this.societyName = societyName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pin = pin;
    }

}

class Person {
    private String name;
    private int age;
    Address address;

    Person(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }
    Person(String name,int age,Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    void displayPerson(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    void displayPersonWithAddress(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address.houseNo);
        System.out.println(this.address.societyName);
        System.out.println(this.address.city);
        System.out.println(this.address.state);
        System.out.println(this.address.country);
        System.out.println(this.address.pin);
    }
}

