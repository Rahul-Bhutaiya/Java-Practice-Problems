package Array.Array_Assignment1;

import java.util.Arrays;

public class GivenAnArray_CreateAnotherArrayWithDoubleSizeOfGivenArrayAndCopyArrayElementTwoTimesInArray2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int[] arr2 = new int[arr.length*2];

        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
            arr2[i+arr.length]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
