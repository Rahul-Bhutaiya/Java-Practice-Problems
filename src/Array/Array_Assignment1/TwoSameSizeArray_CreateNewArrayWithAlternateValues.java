package Array.Array_Assignment1;

import java.util.Arrays;

public class TwoSameSizeArray_CreateNewArrayWithAlternateValues {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40};
        int[] arr2={40,50,60,70};
        int[] alternateArray=new int[arr1.length*2];
        int index=0;

        for(int i=0;i<arr1.length;i++){
            alternateArray[index]=arr1[i];
            index++;
            alternateArray[index]=arr2[i];
            index++;
        }

        System.out.println(Arrays.toString(alternateArray));
    }
}
//done