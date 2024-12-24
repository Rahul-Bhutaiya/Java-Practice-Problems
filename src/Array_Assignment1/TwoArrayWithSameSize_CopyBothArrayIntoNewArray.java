package Array_Assignment1;

import java.util.Arrays;

public class TwoArrayWithSameSize_CopyBothArrayIntoNewArray {
    public static void main(String[] args) {
        int[] arr1={10,20,30};
        int[] arr2={40,50,60};
        int[] copyArray=new int[arr1.length*2];

        for(int i=0;i<arr1.length;i++){
            copyArray[i]=arr1[i];
            copyArray[i+arr1.length]=arr2[i];
        }
        System.out.println(Arrays.toString(copyArray));
    }
}
