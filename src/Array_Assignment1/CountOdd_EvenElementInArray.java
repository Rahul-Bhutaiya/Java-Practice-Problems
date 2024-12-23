package Array_Assignment1;

public class CountOdd_EvenElementInArray {
    public static void main(String[] args) {
        int[] arr={11,20,30,40,50};
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                odd++;
            }
            else{
                even++;
            }
        }
        System.out.println("Odd = "+odd+" Even = "+even);
    }
}
