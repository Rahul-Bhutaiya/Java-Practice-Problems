package Array.Array_Assignment1;

public class CopyFirstOddThenEvenInAnotherArray {
    public static void main(String[] args) {
        int[] arr={2,1,8,3,5,10};
        int[] copiedArray = new int[arr.length];
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                copiedArray[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                copiedArray[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<copiedArray.length;i++){
            System.out.println(copiedArray[i]);
        }
    }
}
//done