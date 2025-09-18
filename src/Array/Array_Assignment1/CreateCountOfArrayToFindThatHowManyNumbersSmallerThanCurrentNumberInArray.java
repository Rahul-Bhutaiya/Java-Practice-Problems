package Array.Array_Assignment1;

import java.util.Arrays;

public class CreateCountOfArrayToFindThatHowManyNumbersSmallerThanCurrentNumberInArray {
    public static void main(String[] args) {
        int[] arr={2,6,0,5,-9,3};
        int[] countArray = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int currentCount=0;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]>arr[j]){
                        currentCount++;
                    }
                }
            }
            countArray[i]=currentCount;
        }
        System.out.println(Arrays.toString(countArray));
    }
}
//done