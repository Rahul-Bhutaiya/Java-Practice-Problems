package Array.Matrix.Find_element_from_sorted_matrix;

public class Solution1_Using_Applying_Binary_Search_in_Every_Row {
    public static void main(String[] args) {
        int[][] arr={{2,5,9,10},{16,18,23,28},{30,32,33,39},{45,46,50,58}};
        int target=-2;

        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=arr[0].length-1;

            while (start<=end){
                int mid=start+(end-start)/2;
                if(arr[i][mid]==target){
                    System.out.println("Present");
                    return;
                }else if(arr[i][mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        System.out.println("Not Present");
    }
}
//Time Complexity : O(row * log column)