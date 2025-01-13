package Sorting_Methods;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr={4,1,5,2,3};

        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(i!=minIndex){
                arr[minIndex]+=arr[i];
                arr[i]=arr[minIndex]-arr[i];
                arr[minIndex]=arr[minIndex]-arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
