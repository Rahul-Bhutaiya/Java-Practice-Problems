package Sorting_Methods;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={4,1,2,5,3};

        for(int i=0;i<arr.length-1;i++){
            boolean swapStatus=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapStatus=true;
                }
            }
            if(!swapStatus){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
