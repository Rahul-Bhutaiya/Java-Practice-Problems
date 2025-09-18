package OOPs.OOPByKunalKushwaha.Lac3.Polymorphism.CompileTime;

public class Practice1 {
    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b, int c){
        return a+b+c;
    }

    double sum(double a,double b){
        return a+b;
    }

    double sum(int a,double b){
        return a+b;
    }

    double sum(double a,int b){
        return a+b;
    }

    // compile time polymorphism will not occur by changing method's return type
    // following is compile time error
//    int sum(double a,int b){
//        return (int)a+b;
//    }

    public static void main(String[] args) {
        Practice1 pr1 = new Practice1();

        // compile time polymorphism by changing number of arguments
//        System.out.println(pr1.sum(10,20));
//        System.out.println(pr1.sum(10,20,30));

        // compile time polymorphism by changing types of parameters
//        System.out.println(pr1.sum(12.0,10));

        // compile time polymorphism by changing ordering of parameters
//        System.out.println(pr1.sum(12,10.2));
//        System.out.println(pr1.sum(12.2,10));
    }
}
