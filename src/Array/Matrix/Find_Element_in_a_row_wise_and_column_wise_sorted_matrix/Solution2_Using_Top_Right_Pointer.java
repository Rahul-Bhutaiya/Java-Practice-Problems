package Array.Matrix.Find_Element_in_a_row_wise_and_column_wise_sorted_matrix;

public class Solution2_Using_Top_Right_Pointer {
    public static void main(String[] args) {
        int[][] arr={{2,16,26,36},{5,18,29,40},{18,20,35,46},{19,25,40,52}};
        int rowPointer=0;
        int columnPointer=arr[0].length-1;
        int target=20;

        while (rowPointer<arr.length && columnPointer>=0){
            System.out.println("rp");
            if(target == arr[rowPointer][columnPointer]){
                System.out.println("Present");
                return;
            }else if(arr[rowPointer][columnPointer]<target){
                rowPointer++;
            }else{
                columnPointer--;
            }
        }
        System.out.println("Not Present");
    }
}
//Time Complexity : O(row + Column)