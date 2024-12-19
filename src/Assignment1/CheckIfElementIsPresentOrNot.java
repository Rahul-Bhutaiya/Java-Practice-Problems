package Assignment1;

public class CheckIfElementIsPresentOrNot {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int n=10;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Present");
                return;
            }
        }
        System.out.println("Not Present");
    }
}
