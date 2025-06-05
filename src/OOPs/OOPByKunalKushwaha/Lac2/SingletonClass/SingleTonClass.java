package OOPs.OOPByKunalKushwaha.Lac2.SingletonClass;

public class SingleTonClass {
    private SingleTonClass(){
        SingleTonClass.objectCount++;
    }

    private static SingleTonClass obj;
    public static int objectCount = 0;


    public static SingleTonClass getInstance(){
        if(obj==null){
            obj = new SingleTonClass();
        }
        return obj;
    }
}
