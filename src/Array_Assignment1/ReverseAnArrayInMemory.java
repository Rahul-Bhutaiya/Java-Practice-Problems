package Array_Assignment1;


import java.util.Arrays;

public class ReverseAnArrayInMemory {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int index=0;
        for(int i=arr.length-1;i>=arr.length/2;i--){
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
