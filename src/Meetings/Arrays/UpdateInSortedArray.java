package Meetings.Arrays;

import java.util.Arrays;

public class UpdateInSortedArray {
    public static void main(String[] args) {
        int[] arr={10,20,25,29,30,30,30,30,30,40};

        System.out.println(Arrays.toString(arr));
        update(arr,30,35);
        System.out.println(Arrays.toString(arr));
    }
    public static void update(int[] arr,int oldValue, int newValue){
        int left=0,right=arr.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==oldValue){
                arr[mid]=newValue;
                while (mid<arr.length-1 && arr[mid+1]==oldValue){
                    mid++;
                    arr[mid]=newValue;
                }
                while (mid>0 && arr[mid-1]==oldValue){
                    mid--;
                    arr[mid]=newValue;
                }
            }
            else if (arr[mid]>oldValue) {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        Arrays.sort(arr);
    }
}
