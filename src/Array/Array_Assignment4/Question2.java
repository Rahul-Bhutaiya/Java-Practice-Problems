package Array.Array_Assignment4;

public class Question2 {
    public static void main(String[] args) {
//        int[] arr={5,3,10,9,6,13};
        int[] arr={50,2,5,7,3,6};

        for(int i=0;i<arr.length-1;i++){
            int nextGreatest=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    nextGreatest=arr[j];
                    break;
                }
            }
            System.out.print(nextGreatest + " ");
        }
        System.out.println(-1);
    }
}
