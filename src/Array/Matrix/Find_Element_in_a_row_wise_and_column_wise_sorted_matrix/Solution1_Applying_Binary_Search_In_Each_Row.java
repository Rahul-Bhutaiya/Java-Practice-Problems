package Array.Matrix.Find_Element_in_a_row_wise_and_column_wise_sorted_matrix;

public class Solution1_Applying_Binary_Search_In_Each_Row {
    public static void main(String[] args) {
        int[][] arr={{2,16,26,35},{5,18,29,40},{18,20,35,46},{19,25,40,52}};
        int target=16;

        for(int i=0;i<arr.length;i++){
            int left=0;
            int right = arr[0].length-1;

            while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[i][mid]==target){
                    System.out.print("Present");
                    return;
                }else if(arr[i][mid]<target){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        System.out.println("Not Present");
    }
}
//Time Complexity : O(row * log Column)