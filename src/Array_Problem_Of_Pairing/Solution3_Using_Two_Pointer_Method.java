package Array_Problem_Of_Pairing;

public class Solution3_Using_Two_Pointer_Method {
    public static void main(String[] args) {
//        only applicable on sorted array
        int[] arr={0,2,4,8,11,19,20};
        int target = 25;
        int left=0;
        int right=arr.length-1;
        while (left!=right){
            if(arr[left]+arr[right]==target){
                System.out.println("Present");
                return;
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println("Not Present");
    }
}
//Time Complexity=O(n)
