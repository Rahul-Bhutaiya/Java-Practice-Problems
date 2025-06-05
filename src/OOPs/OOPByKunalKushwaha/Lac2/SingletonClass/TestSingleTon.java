package OOPs.OOPByKunalKushwaha.Lac2.SingletonClass;

public class TestSingleTon {
    public static void main(String[] args) {
        SingleTonClass obj = SingleTonClass.getInstance();
        SingleTonClass obj2 = SingleTonClass.getInstance();
        SingleTonClass obj3 = SingleTonClass.getInstance();
        SingleTonClass obj4 = SingleTonClass.getInstance();
        SingleTonClass obj5 = SingleTonClass.getInstance();
        SingleTonClass obj6 = SingleTonClass.getInstance();
        System.out.println(SingleTonClass.objectCount); //1
    }
}
