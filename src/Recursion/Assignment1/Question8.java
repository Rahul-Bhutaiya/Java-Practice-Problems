package Recursion.Assignment1;

//calculate the product of two numbers using recursion & you can't use multiplication operator
public class Question8 {
    public static void main(String[] args) {
        System.out.println(getProduct(1,3));
    }

    public static int getProduct(int n1,int n2){
        if(n2==1){
            return n1;
        }
        return n1+getProduct(n1,n2-1);
    }
}
