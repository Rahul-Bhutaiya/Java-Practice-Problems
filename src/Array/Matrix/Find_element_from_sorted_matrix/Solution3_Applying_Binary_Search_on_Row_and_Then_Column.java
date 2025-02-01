package Array.Matrix.Find_element_from_sorted_matrix;

public class Solution3_Applying_Binary_Search_on_Row_and_Then_Column {
    public static void main(String[] args) {
        int[][] arr={{2,5,9,10},{16,18,23,28},{30,32,33,39},{45,46,50,58}};
        int target = 10;
        int rowSize=arr.length;
        int colSize=arr[0].length;

        int top=0;
        int bottom=rowSize-1;

        while (top<=bottom){
            int midRow=top+(bottom-top)/2;
            if(target>=arr[midRow][0] && target<=arr[midRow][colSize-1]){
                int left=0;
                int right=colSize-1;
                while (left<=right){
                    int midCol=left+(right-left)/2;
                    if(target==arr[midRow][midCol]){
                        System.out.println("Present");
                        return;
                    }else if(target<arr[midRow][midCol]){
                        right=midCol-1;
                    }else{
                        left=midCol+1;
                    }
                }
                System.out.println("Not Present");
                return;
            }else if(target<arr[midRow][0]){
                bottom=midRow-1;
            }else{
                top=midRow+1;
            }
        }
        System.out.println("Not Present");
    }
}
//Time Complexity : O(log col + log row)