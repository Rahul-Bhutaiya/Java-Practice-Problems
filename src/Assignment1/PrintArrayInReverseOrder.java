package Assignment1;

public class PrintArrayInReverseOrder {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
