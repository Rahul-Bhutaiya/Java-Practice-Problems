package ComparableComparator.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Given an array of integers, sort the array such that it creates the biggest number possible.
//Array : {10,17,8,200,5}
//After sort : {8,5,200,17,10} which creates biggest number
//852001710
public class AssignmentQuestion {
    public static void main(String[] args) {
//        int[] arr = {10,17,8,200,150,5};
//        System.out.println(Arrays.toString(arr));
//        getBiggestNumber(arr);
//        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> arl = new ArrayList<>();
        arl.add(10);
        arl.add(17);
        arl.add(8);
        arl.add(200);
        arl.add(150);
        arl.add(5);

        System.out.println(arl);
        arl.sort(new GreaterNumber());
        System.out.println(arl);
    }

    public static void getBiggestNumber(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                String s1 = arr[j]+""+arr[j+1];
                String s2 = arr[j+1]+""+arr[j];
                if(Integer.parseInt(s2)>Integer.parseInt(s1)){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class GreaterNumber implements Comparator<Integer>{
    @Override
    public int compare(Integer n1, Integer n2) {
        String t1 = n1+""+n2;
        String t2 = n2+""+n1;

        return Integer.parseInt(t2)-Integer.parseInt(t1);
    }
}