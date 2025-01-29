package Array.ArrayMethods;

import java.util.Arrays;

public class Q2_ArrayMethod_On_Sorted_Array {
    public static void main(String[] args) {
        int[] arr={10,20,30,0,0,0,0};
        int index=3;
//        System.out.println(Arrays.toString(arr));
        index= insert(arr,5,index);
        index= insert(arr,10,index);
        index= insert(arr,35,index);
        System.out.println(Arrays.toString(arr));

//        update(arr,30,8,index);
//        index = delete(arr,10,index);
//        print(arr,index);
//        System.out.println(search(arr,45,index));
//        System.out.println(size(index));
//        System.out.println(isEmpty(index));

        System.out.println(Arrays.toString(arr));
    }

    private static int insert(int[] arr,int value,int index){
        if(index==arr.length){
            System.out.println("Your Array is Full...");
            return index;
        }else{
            for(int i=0;i<index;i++){
                if(arr[i]>=value){
                    int temp=arr[i];
                    arr[i]=value;
                    for (int j=i+1;j<=index;j++){
                        int temp2=arr[j];
                        arr[j]=temp;
                        temp=temp2;
                    }
                    index++;
                    return index;
                }
            }
            arr[index]=value;
            index++;
            return index;
        }
    }

    private static void update(int[] arr,int oldValue,int newValue,int index){
        if(oldValue!=newValue){
            boolean isOldExists=false;
            for(int i=0;i<index;i++){
                if(arr[i]==oldValue){
                    arr[i]=newValue;
                    isOldExists=true;
                }
            }
            if(isOldExists){
                for(int i=0;i<index-1;i++){
                    boolean swap=false;
                    for(int j=0;j<index-i-1;j++){
                        if(arr[j]>arr[j+1]){
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                            swap=true;
                        }
                    }
                    if(!swap){
                        break;
                    }
                }
            }else{
                System.out.println("Old Value isn't Exists. So Can't Update");
            }
        }
        else{
            System.out.println("Can't Update Because OldValue and NewValue both are same");
        }
    }

    private static int delete(int[] arr,int delValue,int index){
        for(int i=0;i<index;i++){
            if(arr[i]==delValue){
                for(int j=i;j<index-1;j++){
                    arr[j]=arr[j+1];
                }
                index--;
                i--;
            }
        }
        return index;
    }

    private static void print(int[] arr,int index){
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static boolean search(int[] arr,int sValue,int index){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==sValue){
                return true;
            }
            else if(arr[mid]<sValue){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }

    private static int size(int index){
        return index;
    }

    private static boolean isEmpty(int index){
        if(index==0){
            return true;
        }else{
            return false;
        }
    }
}
