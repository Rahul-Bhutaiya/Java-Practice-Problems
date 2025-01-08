package ArrayMethods;

import java.util.Arrays;

public class Q1_ArrayMethods {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index=0;

        index = insert(arr,10,index);
        index = insert(arr,20,index);
        index = insert(arr,30,index);
        index = insert(arr,40,index);
        index = insert(arr,50,index);
        update(arr,30,300,index);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,3000,index));
        print(arr,index);
        System.out.println(isEmpty(index));
        System.out.println(size(index));

        System.out.println("array = "+Arrays.toString(arr));
        System.out.println("index = "+index);

        index = delete(arr,300,index);
        print(arr,index);
        System.out.println(Arrays.toString(arr));
        System.out.println("index = "+index);
    }
    private static int insert(int[] arr,int value,int index){
        if(arr.length==index){
            System.out.println("Array is full");
            return index;
        }
        arr[index]=value;
        index++;
        return index;
    }

    private static void update(int[] arr,int oldVal, int newVal,int index){
        for(int i=0;i<index;i++){
            if(arr[i]==oldVal){
                arr[i]=newVal;
            }
        }
    }

    private static int delete(int[] arr,int value,int index){
        for(int i=0;i<index;i++){
            if(arr[i]==value){
                for(int j=i;j<index-1;j++){
                    arr[j]=arr[j+1];
                }
                i--;
                index--;
            }
        }
        return index;
    }
    private static boolean search(int[] arr,int value,int index){
        for(int i=0;i<index;i++){
            if(arr[i]==value){
                return true;
            }
        }
        return false;
    }
    private static void print(int[] arr,int index){
        if(index==0){
            System.out.println("Array is Empty");
            return;
        }
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static boolean isEmpty(int index){
        if(index==0){
            return true;
        }
        return false;
    }
    private static int size(int index){
        return index;
    }
}
