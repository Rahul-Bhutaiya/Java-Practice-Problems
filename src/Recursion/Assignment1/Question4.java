package Recursion.Assignment1;

//Print the array elements without using loop
public class Question4 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        printArr(arr,0);
        printArrReverse(arr,0);
    }
    public static void printArr(int[] arr, int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index] + " ");
        printArr(arr,++index);
    }

    public static void printArrReverse(int[] arr, int index){
        if(index==arr.length){
            return;
        }
        printArrReverse(arr,index+1);
        System.out.print(arr[index] + " ");
    }
}
