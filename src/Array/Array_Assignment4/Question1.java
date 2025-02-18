package Array.Array_Assignment4;

public class Question1 {
    public static void main(String[] args) {
//        int[] arr= {7, 10, 17, 22, 40, 1, 3, 5};
        int[] arr= {7, 10, 17, 22, 19, 40, 1, 3, 5};
//        int[] arr= {7, 10, 17, 22};

        int target=1;

        int left=0;
        int right=arr.length-1;

        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println("Present");
                return;
            }
            else{
                if(arr[left]<arr[mid]){
                    if(arr[left]<=target && arr[mid]>target){
                        right=mid-1;
                    }else{
                        left=mid+1;
                    }
                }else{
                    if(arr[mid]<target && arr[right]>=target){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }
                }
            }
        }
        System.out.println("Not Present");
    }
}
