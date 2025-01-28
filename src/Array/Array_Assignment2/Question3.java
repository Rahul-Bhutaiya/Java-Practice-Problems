package Array.Array_Assignment2;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {9,2,5,7,3,8,9,0};
        int[] a1 = new int[arr.length/2];
        int[] a2 = new int[arr.length/2];

        for(int i=0;i<arr.length/2;i++){
            a1[i]=arr[i];
            a2[i]=arr[i+a2.length];
        }
        System.out.println("a1 = "+Arrays.toString(a1));
        System.out.println("a2 = "+Arrays.toString(a2));
    }
}
