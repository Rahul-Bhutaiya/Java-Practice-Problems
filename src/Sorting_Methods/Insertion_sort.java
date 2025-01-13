package Sorting_Methods;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={4,1,5,2,3};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int previous=i-1;
            while (previous>=0 && arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
