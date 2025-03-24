package Array.Array_Assignment1;

import java.util.Arrays;
import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        int[] nextGreater = new int[10001]; // Assuming constraint of elements ≤ 10000
        Arrays.fill(nextGreater, -1);
        System.out.println(Arrays.toString(nextGreater));
//        int[] ar1={10,20,30};
//        int[] ar2={40,50,60};
//        int[] ar3=new int[ar1.length+ar2.length];
//        int p=0;
//        for(int i=0;i<ar3.length;i+=2){
//            ar3[i]=ar1[p];
//            ar3[i+1]=ar2[p];
//            p++;
//        }
//        System.out.println(Arrays.toString(ar3));

//        int[] arr={10,20,20,20,30,40,10,5};
//        Stack<Integer> stack=new Stack<>();
//        int p=0;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        for(int i=1;i<arr.length;i++){
//            if(arr[p]!=arr[i]){
//                p=i;
//            }
//            else{
//                if(stack.isEmpty()){
//                    stack.push(arr[i]);
//                }
//                else if(stack.peek()<arr[i]){
//                    stack.push(arr[i]);
//                }
//            }
//        }
//        System.out.println(stack);

//        int[] arr={10,20,20,30,20,40,50};
//        int p=7;
//        p=delete(arr,p,20);
//        System.out.println(Arrays.toString(arr));
    }
    public static int delete(int[] arr,int p,int deleting){
        for(int i=0;i<p;i++){
            if(arr[i]==deleting){
                for(int j=i;j<p-1;j++){
                    arr[j]=arr[j+1];
                }
                p--;
                i--;
            }
        }
        return p;
    }
}
