package Recursion.Assignment1;

//print 1 to n
public class Print1ToN {
    public static void main(String[] args) {
        print(5);
    }

    public static int print(int n){
        if(n==1){
            System.out.print(1 + " ");
            return 1;
        }
        print(n-1);
        System.out.print(n + " ");
        return n;
    }

}
