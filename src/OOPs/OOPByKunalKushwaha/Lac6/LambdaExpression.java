package OOPs.OOPByKunalKushwaha.Lac6;

public class LambdaExpression {
    Operation sum = (int a,int b)->a+b;
    int makeOperation(int a,int b,Operation op){
        return op.ope(a,b);
    }
    public static void main(String[] args) {
        LambdaExpression le = new LambdaExpression();
        int result = le.makeOperation(10,20,le.sum);
        System.out.println("result = "+result);
    }
}

@FunctionalInterface
interface Operation{
    int ope(int a,int b);
}
