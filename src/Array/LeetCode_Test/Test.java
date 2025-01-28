package Array.LeetCode_Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5,6,2,0,0,4,6,2,4,9};
        System.out.println(Arrays.toString(plusOne(arr)));
//        long sum=5620046250L;
//        System.out.println(sum%10);
    }
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]++;
            return digits;
        }else{
            double max=0;
            int inputLength=digits.length;
            while(inputLength>0){
                max=(max*10)+9;
                inputLength--;
            }
            double sum=0;
            for(int i=0;i<digits.length;i++){
                sum=(sum*10)+digits[i];
            }
            sum++;
            int[] newArr;
            if(sum<max){
                newArr=new int[digits.length];
            }else{
                newArr=new int[digits.length+1];
            }
            int length=newArr.length-1;
            while(sum>0){
                double remainder=sum%10;
                newArr[length]=(int)remainder;
                length--;
                sum=sum/10;
            }
            return newArr;
        }
    }
}
