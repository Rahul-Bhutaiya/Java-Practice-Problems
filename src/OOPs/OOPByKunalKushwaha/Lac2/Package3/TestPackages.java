package OOPs.OOPByKunalKushwaha.Lac2.Package3;

import OOPs.OOPByKunalKushwaha.Lac2.Package1.Greetings;
import static OOPs.OOPByKunalKushwaha.Lac2.Package2.Greetings.print;

public class TestPackages {
    public static void main(String[] args) {
        Greetings p1 = new Greetings();
        OOPs.OOPByKunalKushwaha.Lac2.Package2.Greetings p2 = new OOPs.OOPByKunalKushwaha.Lac2.Package2.Greetings();
        p1.makeGreetings();
        p2.makeGreetings();

        print();

    }
}
