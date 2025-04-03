package Meetings.Arrays;

import java.util.Arrays;

public class DeleteInSortedArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,30,40,50,60,70,80,90,100,100,100};
        System.out.println(Arrays.toString(arr));
        System.out.println(delete(arr,-30));
        System.out.println(Arrays.toString(arr));
    }
    public static int delete(int[] arr, int delValue){
        int left=0,right=arr.length-1;
        int lastIndex=arr.length;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==delValue){
                while (mid< arr.length-1 && arr[mid+1]==delValue){
                    mid++;
                }
                if(mid==arr.length-1){
                    while (mid<=arr.length-1 && arr[mid]==arr[mid-1]){
                        mid--;
                        lastIndex--;
                    }
                    return lastIndex-1;
                }

                while (mid>=0 && arr[mid]==delValue){
                    for(int i=mid;i<lastIndex-1;i++){
                        arr[i]=arr[i+1];
                    }
                    mid--;
                    lastIndex--;
                }
            }
            else if(arr[mid]>delValue){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return lastIndex;
    }
}
