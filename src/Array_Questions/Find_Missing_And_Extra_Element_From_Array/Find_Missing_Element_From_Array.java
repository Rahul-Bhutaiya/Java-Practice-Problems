package Array_Questions.Find_Missing_And_Extra_Element_From_Array;

public class Find_Missing_Element_From_Array {
    public static void main(String[] args) {
        int[] arr={4,3,5,1};
        int n=5;
        int arraySum=0;
        int nSum=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            arraySum+=arr[i];
        }
        System.out.println("Missing Element = "+ (nSum-arraySum));
    }
}
