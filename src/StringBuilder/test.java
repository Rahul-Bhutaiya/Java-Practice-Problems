package StringBuilder;

public class test {
    test(){
        System.out.println("This is default constructor");
    }

    public static void main(String[] args) {


        StringBuilder s1= new StringBuilder("Rahul");
        System.out.println((char)('a'+('1'-'0')));

//        StringBuilder s2= new StringBuilder("Rahul");
//        System.out.println(s1==s2);//false

//        System.out.println(s1.length());//5

//        System.out.println(s1.charAt(2));//h
//
//        s1.setCharAt(1,'o');
//        System.out.println(s1);//Rohul

//        s1.insert(0,"P");
//        System.out.println(s1);//PRahul

//        s1.delete(0,1);
//        System.out.println(s1);//ahul
//        s1.delete(0,3);
//        System.out.println(s1);//ul

//        s1.append(" Bhutaiya");
//        System.out.println(s1);//Rahul Bhutaiya

//        System.out.println(s1.toString());//Rahul //converts StringBuilder into String

    }
}
