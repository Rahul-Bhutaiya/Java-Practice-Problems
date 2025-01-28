package Array.Array_Questions.Array_Problem_Of_Pairing;

public class Solution2_Using_Binary_Search {
    public static void main(String[] args) {
//        only applicable on sorted array
        int[] arr={0,2,4,8,11,19,20};
        int target=25;
        for(int i=0;i<arr.length-1;i++){
            int expect = target-arr[i];
            int left=i+1;
            int right=arr.length-1;
            while(left<=right){
                int middle=left+(right-left)/2;
                if(arr[middle]==expect){
                    System.out.println("Present");
                    return;
                }else if(arr[middle]<expect){
                    left=middle+1;
                }else{
                    right=middle-1;
                }
            }
        }
        System.out.println("Not Present");
    }
}
//Time Complexity = O(nlogn)
