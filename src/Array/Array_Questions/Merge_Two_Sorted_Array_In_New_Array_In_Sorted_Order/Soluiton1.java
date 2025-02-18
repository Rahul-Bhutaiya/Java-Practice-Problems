package Array.Array_Questions.Merge_Two_Sorted_Array_In_New_Array_In_Sorted_Order;

import java.util.Arrays;

public class Soluiton1 {
    public static void main(String[] args) {
        int[] arr2={1,2,23,44,53,440};
        int[] arr1={1,2,3,4,5,88,666};
        int arr1Length=arr1.length;
        int arr2Length=arr2.length;
        int[] arr3 = new int[arr1Length+arr2Length];
        int arr1Index=0,arr2Index=0,arr3Index=0;

        while (arr1Index<arr1Length && arr2Index<arr2Length){
            if(arr1[arr1Index]<arr2[arr2Index]){
                arr3[arr3Index]=arr1[arr1Index];
                arr1Index++;
            }else{
                arr3[arr3Index]=arr2[arr2Index];
                arr2Index++;
            }
            arr3Index++;
        }
        while (arr1Index<arr1Length){
            arr3[arr3Index]=arr1[arr1Index];
            arr1Index++;
            arr3Index++;
        }
        while (arr2Index<arr2Length){
            arr3[arr3Index]=arr2[arr2Index];
            arr3Index++;
            arr2Index++;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
//Time Complexity : O(n+m)
//Space Complexity : O(n+m)
