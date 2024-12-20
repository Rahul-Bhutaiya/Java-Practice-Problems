package Assignment1;

public class CopyArrayElementsIntoAnotherNewArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,44,50,60};
        int[] copiedArray = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            copiedArray[i]=arr[i];
            System.out.println(copiedArray[i]);
        }
    }
}
