package ArrayList;

import java.util.ArrayList;

public class About_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList= new ArrayList<>(5);

        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(0,90);
        System.out.println(arrList);

//        arrList.clear();
//        arrList.remove(0);
//        arrList.set(0,100); //updation
//        System.out.println(arrList.contains(10));
//        System.out.println(arrList.size());

//        System.out.println(arrList.get(2));
//        System.out.println(arrList.size());
//        for(int i=0;i<arrList.size();i++){
//            System.out.println(arrList.get(i));
//        }
//        for(int ele:arrList){
//            System.out.println(ele);
//        }
        System.out.println(arrList);
    }
}
