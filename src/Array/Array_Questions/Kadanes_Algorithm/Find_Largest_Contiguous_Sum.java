package Array.Array_Questions.Kadanes_Algorithm;

public class Find_Largest_Contiguous_Sum {
    public static void main(String[] args) {
        // "If your sub-array sum becomes negative, then reset it to 0"
        int[] arr={2,4,-7,6,-3,5,9,-8,-7};
        int sum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum>sum){
                sum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        System.out.println(sum);
    }
}
