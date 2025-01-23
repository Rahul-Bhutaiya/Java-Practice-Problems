package Array_Questions.Find_Missing_And_Extra_Element_From_Array;

public class Find_Extra_Element_From_Array {
    public static void main(String[] args) {
        int[] arr={3,15,2,4,1,5};
        int n = 5;
        int nSum=(n*(n+1))/2;
        int arraySum=0;
        for(int i=0;i<arr.length;i++){
            arraySum+=arr[i];
        }
        System.out.println("Extra Element = " + (arraySum-nSum));
    }
}
