package Array.Matrix.Find_Element_in_a_row_wise_and_column_wise_sorted_matrix;

public class Solution3_Using_Bottom_Left_Pointer {
    public static void main(String[] args) {
        int[][] arr={{2,16,26,35},{5,18,29,40},{18,20,36,46},{19,25,40,52}};
        int target=46;
        int rowPointer= arr.length-1;
        int colPointer=0;

        while (rowPointer>=0 && colPointer<arr[0].length){
            if(target==arr[rowPointer][colPointer]){
                System.out.println("Present");
                return;
            } else if (arr[rowPointer][colPointer]<target) {
                colPointer++;
            }else{
                rowPointer--;
            }
        }
        System.out.println("Not Present");
    }
}
//Time Complexity : O(row + Column)