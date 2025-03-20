package Array.Array_Assignment1;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] ar1={10,20,30};
        int[] ar2={40,50,60};
        int[] ar3=new int[ar1.length+ar2.length];
        int p=0;
        for(int i=0;i<ar3.length;i+=2){
            ar3[i]=ar1[p];
            ar3[i+1]=ar2[p];
            p++;
        }
        System.out.println(Arrays.toString(ar3));
    }
}
