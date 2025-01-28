package Array.Array_Assignment1;

public class GivenTwoArrays_WhereFirstArrayWillBeUnique_FindCommonElementsFromBothArrays {
    public static void main(String[] args) {
        int[] arr1={5,9,0,8,6,4,13}; //this array will be unique
        int[] arr2={9,5,3,8,5,40,0};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
