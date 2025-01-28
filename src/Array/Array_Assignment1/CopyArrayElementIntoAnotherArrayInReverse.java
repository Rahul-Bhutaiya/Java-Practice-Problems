package Array.Array_Assignment1;

public class CopyArrayElementIntoAnotherArrayInReverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] copiedArray = new int[arr.length];
        int index = 0;
        for(int i=arr.length-1;i>=0;i--){
            copiedArray[index]=arr[i];
            index++;
        }
        for(int i=0;i<copiedArray.length;i++){
            System.out.println(copiedArray[i]);
        }
    }
}
