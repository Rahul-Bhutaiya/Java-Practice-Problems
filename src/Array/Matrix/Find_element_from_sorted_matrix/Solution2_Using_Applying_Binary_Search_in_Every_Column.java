package Array.Matrix.Find_element_from_sorted_matrix;

public class Solution2_Using_Applying_Binary_Search_in_Every_Column {
    public static void main(String[] args) {
        int[][] arr={{2,5,9,10},{16,18,23,28},{30,32,33,39},{45,46,50,58}};
        int target=10;

        for(int i=0;i<arr[0].length;i++){
            int top=0;
            int bottom= arr.length-1;
            while (top<=bottom){
                int mid=top+(bottom-top)/2;
                if(arr[mid][i]==target){
                    System.out.println("Present");
                    return;
                }else if(arr[mid][i]>target){
                    bottom=mid-1;
                }else{
                    top=mid+1;
                }
            }
        }
        System.out.println("Not Present");
    }
}
//Time Complexity : O(column * log row)