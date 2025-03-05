package String;

public class First_Class {
    public static void main(String[] args) {

        String s1="Rahul";
        String s2="Rahul";
        String s3=new String("Rahul");
        String s4=new String("Rahul");

        System.out.println(s1==s3); //false --> Shallow comparison --> Address Check
        System.out.println(s3==s4); //false --> reference or address is different

        System.out.println(s1.equals(s3)); //true --> Deep Comparison --> content check
        System.out.println(s1==s2); //true


        System.out.println(s3.equals(s4)); // true
    }
}
