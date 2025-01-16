package Array_Assignment3;

public class DoBinarySearchToCheckThatGivenNumerIsPresentInArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {10,20,300,40,50,60,70,80};
        int k=30;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
//            int middle=(left+right)/2;
            int middle = left+((right-left)/2);
            if(arr[middle]==k){
                System.out.println("Present");
                return;
            }else if(arr[middle]<k){
                left=middle+1;
            }else{
                right=middle-1;
            }
        }
        System.out.println("Not Present");
    }
}
