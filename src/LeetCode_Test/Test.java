package LeetCode_Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5,6,2,0,0,4,6,2,4,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]++;
            return digits;
        }else{
            long max=0;
            int inputLength=digits.length;
            while(inputLength>0){
                max=(max*10)+9;
                inputLength--;
            }
            long sum=0;
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
                int remainder=(int)sum%10;
                newArr[length]=remainder;
                length--;
                sum=sum/10;
            }
            return newArr;
        }
    }
}
