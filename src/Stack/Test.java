package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Test {

       static int[] arr={22,33,44,55,66,77,88,0,0,0,0};
//       static int[] arr={22,33,44,55,55,66,77,88,0,0,0};
       static int pointer=7;
    public static void main(String[] args) {
        add(200);
        add(20);
        System.out.println(Arrays.toString(arr));
    }

    public static void add(int value){
        if(pointer==arr.length){
            System.out.println("Array is full");
            return;
        }

        int index=pointer-1;
        pointer++;
        for(;index>=0;index--){
            if(arr[index]>value){
                arr[index+1]=arr[index];
            }
            else{
                arr[index+1]=value;
                return;
            }
        }
        if(index==-1){
            arr[index+1]=value;
        }
    }
}
