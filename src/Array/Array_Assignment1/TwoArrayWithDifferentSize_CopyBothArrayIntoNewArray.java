package Array.Array_Assignment1;

import java.util.Arrays;

public class TwoArrayWithDifferentSize_CopyBothArrayIntoNewArray {
    public static void main(String[] args) {
        int[] arr1={50,60,70,80,90};
        int[] arr2={10};
        int[] arr3= new int[arr1.length+arr2.length];

        int bigArraySize=arr1.length>arr2.length?arr1.length:arr2.length>arr1.length?arr2.length:arr1.length;

        for(int i=0;i<bigArraySize;i++){
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }
            if(i<arr2.length){
                arr3[i+arr1.length]=arr2[i];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
