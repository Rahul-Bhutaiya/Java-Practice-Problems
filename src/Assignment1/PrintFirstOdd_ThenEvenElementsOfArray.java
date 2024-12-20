package Assignment1;

public class PrintFirstOdd_ThenEvenElementsOfArray {
    public static void main(String[] args) {
        int[] arr={2,1,8,3,5,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                System.out.println(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
