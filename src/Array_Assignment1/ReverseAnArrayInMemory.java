package Array_Assignment1;


import java.util.Arrays;

public class ReverseAnArrayInMemory {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
//        method:1
        int index=0;
        for(int i=arr.length-1;i>=arr.length/2;i--){
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            index++;
        }
        System.out.println(Arrays.toString(arr));

//        method:2
//        int first = 0;
//        int last = arr.length-1;
//        while (last>first){
//            int temp=arr[first];
//            arr[first]=arr[last];
//            arr[last]=temp;
//            last--;
//            first++;
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
