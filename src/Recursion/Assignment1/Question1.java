package Recursion.Assignment1;

//Infinite recursive function
public class Question1 {
    public static void main(String[] args) {
          GM();
    }
    public static void GM(){
        System.out.println("Good Morning");
        GM();
    }
//    public static void GE(){
//        System.out.println("Good Evening");
//        GE();
//    }

    public static long fibonacci(int n){
        if(n==1){
            return 1;
        }

        if(n==0){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
