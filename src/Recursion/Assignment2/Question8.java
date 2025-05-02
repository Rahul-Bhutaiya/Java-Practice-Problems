package Recursion.Assignment2;

import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        int length = 3;
        int[] arr = new int[length];
//        System.out.println(Arrays.toString(generateBinary(arr,7,length)));
        generateStrings(arr,length,0,0);
    }

    public static void generateStrings(int[] arr,int length,int currentNum,int oneCount){
        if(oneCount == length){
            return;
        }
        oneCount = generateBinary(arr,length,currentNum,0);
        generateStrings(arr,length,currentNum+1,oneCount);
    }

    public static int generateBinary(int[] arr,int index,int num,int oneCount){
        if(num==0 || index<=0){
            System.out.println(Arrays.toString(arr));
            return oneCount;
        }
        int remainder = num%2;
        if(remainder==1){
            oneCount++;
        }
        arr[index-1] = remainder;
        num=num/2;
        return generateBinary(arr,index-1,num,oneCount);
    }
}
