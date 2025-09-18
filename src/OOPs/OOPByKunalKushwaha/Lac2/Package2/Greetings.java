package OOPs.OOPByKunalKushwaha.Lac2.Package2;

public class Greetings {
    public void makeGreetings(){
        System.out.println("Hello I am inside Package2");
    }

    public static void main(String[] args) {
        OOPs.OOPByKunalKushwaha.Lac2.Package1.Greetings obj1  = new OOPs.OOPByKunalKushwaha.Lac2.Package1.Greetings();
        obj1.makeGreetings();
        Greetings obj2 = new Greetings();
        obj2.makeGreetings();
    }

    public static void print(){
        System.out.println("Hey, say hello");
    }
}