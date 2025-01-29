package Array.Array_Questions.Kadanes_Algorithm;

public class Find_Largest_Contiguous_Sum {
    public static void main(String[] args) {
//        method 1 : brute force
//        int[] arr={2,4,-7,6,-3,5,9,-8,-7,100};
//        int maxSum=0;
//        for(int i=0;i<arr.length;i++){
//
//            for(int end=i;end<arr.length;end++){
//                int currentSum=0;
//                for(int start=i;start<=end;start++){
//                    currentSum+=arr[start];
//                }
//                if(currentSum>maxSum){
//                    maxSum=currentSum;
//                }
//            }
//        }
//        System.out.println("max sum : "+maxSum);

//        method 2 : Kadane's Algorithm
//        // "If your sub-array sum becomes negative, then reset it to 0"
//        int[] arr={2,4,-7,6,-3,5,9,-8,-7};
//        int sum=Integer.MIN_VALUE;
//        int currentSum=0;
//        for(int i=0;i<arr.length;i++){
//            currentSum+=arr[i];
//            if(currentSum>sum){
//                sum=currentSum;
//            }
//            if(currentSum<0){
//                currentSum=0;
//            }
//        }
//        System.out.println(sum);
    }
}
