package Array.Array_Assignment3;

public class PrintAllDuplicateElementsFromArrayWhereGivenArraysAllElementsWillBePositive {
    public static void main(String[] args) {
        int[] arr={2,10,8,6,10,9,8,2,2,5,3}; //all array elements will positive

        for (int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                continue;
            }
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            if(count>0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
