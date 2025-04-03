package Array.Array_Assignment1;

import java.util.Arrays;
import java.util.Stack;

public class demo {
    public static void main(String[] args) {

        int[] arr={1,20,33,44,55,3,32,354,12};
//        int[] arr={3,55,44,33,20,1,12,354,32};
//        int[] arr={32,354,12,1,20,33,44,55,3};
//        int[] arr={1,20,33,44,55,3,32,354,12};
//        int[] arr={354,12,1,20,33,44,55,3,32};
//        int k=3000;
//        k=k%arr.length;
//        leftRotateArray(arr,k);
////        leftRotateArray2(arr,3);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(new int[]{}));
        System.out.println(30^10);
    }

//    Left rotate an array by d positions

    public static void leftRotateArray(int[] arr,int k){
        for(int i=1;i<=k;i++){
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
    }

    public static void leftRotateArray2(int[] arr,int k){
        int index=k-1;
        int right=arr.length-1;
        while(index>=0){
            int temp=arr[right];
            arr[right]=arr[index];
            arr[index]=temp;
            index--;
            right--;
        }
    }

}
