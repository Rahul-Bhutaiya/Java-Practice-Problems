package Array_Questions_With_Sorting;

public class Find_Second_Largest_Element_From_Array {
    public static void main(String[] args) {
        int[] arr={3,8,9,13,6,4,13};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            } else if (arr[i]>max2 && arr[i]!=max1) {
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
